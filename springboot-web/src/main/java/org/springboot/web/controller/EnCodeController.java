package org.springboot.web.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.code.kaptcha.impl.DefaultKaptcha;

@RestController
@RequestMapping("/code")
public class EnCodeController {

	@Autowired
	DefaultKaptcha defaultKaptcha;
	@GetMapping("/code") 
	public String getCode() throws IOException {
		byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
  
            //生产验证码字符串并保存到session中
            String createText = defaultKaptcha.createText();
          
            //使用生产的验证码字符串返回一个BufferedImage对象并转为byte写入到byte数组中
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
            captchaChallengeAsJpeg =jpegOutputStream.toByteArray();
		return "data:image/jpeg;"+Base64Utils.encodeToString(captchaChallengeAsJpeg);

	}
}
