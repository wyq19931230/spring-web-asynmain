package org.springboot.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(Config.class); MailService mail =
		 * context.getBean(MailService.class); mail.sengDefault("测试", "ceshi");
		 */
		
		SpringApplication.run(App.class, args);
	}
}
