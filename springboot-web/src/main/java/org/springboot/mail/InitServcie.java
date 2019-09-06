package org.springboot.mail;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *InitializingBean接口是在初始化ben的时候执行方法afterPropertiesSet，相当于servlet的	@PostConstruct
 */
@Component
public class InitServcie implements InitializingBean{

	@Autowired
	MailService mailService;
	@Override
	public void afterPropertiesSet() throws Exception {
		mailService.print();
		mailService.sengDefault("测试2", "初始化邮件");
		System.out.println("初始化结束");
	}
	
		
}
