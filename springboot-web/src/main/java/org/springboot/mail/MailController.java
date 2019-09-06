package org.springboot.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {

	@Autowired
	MailService mailService;
	@GetMapping("/mail")
	public void send () {
		mailService.sengDefault("测试", "I'm fisrt ");
		System.out.println("成功");
	}
}
