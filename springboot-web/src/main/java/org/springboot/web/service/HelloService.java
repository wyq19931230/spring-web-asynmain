package org.springboot.web.service;

public class HelloService implements IHelloservice{

	@Override
	public String sayHello() {
		return "hello";
	}
}
