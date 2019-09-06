package org.springboot.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.web.service.IHelloservice;
import org.springboot.web.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class WebController {
	@Autowired
	Person person;
	@Autowired
	IHelloservice helloservice;
	Logger log = LoggerFactory.getLogger(WebController.class);

	@GetMapping("/demo")
	public String map(){
		return person.toString();
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return helloservice.sayHello();
	}
}
