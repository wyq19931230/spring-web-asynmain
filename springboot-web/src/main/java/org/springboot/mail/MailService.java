package org.springboot.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Administrator
 *异步任务：(1)在类上加@EnableAsync  注解(2)在方法上加@Async注解
 * 在@Async标注的方法，同时也适用了@Transactional进行了标注；在其调用数据库操作之时，将无法产生事务管理的控制，原因就在于其是基于异步处理的操作。
 * 方法B，使用了@Async来标注，  B中调用了C、D，C/D分别使用@Transactional做了标注，则可实现事务控制的目的。
 */

@Service
@EnableAsync 
public class MailService {

	@Autowired
	MailVo mailVo;
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Async
	public void  sengDefault(String sub ,String text) {
	 SimpleMailMessage message = new SimpleMailMessage();
	 message.setFrom(mailVo.getFrom());	 
	 message.setTo(mailVo.getTo());	 
	 message.setSubject(sub);
	 message.setText(text);
	 javaMailSender.send(message);
	}
	
	public void print() {
		System.out.println("容器初始化执行！-----");
	}
}
