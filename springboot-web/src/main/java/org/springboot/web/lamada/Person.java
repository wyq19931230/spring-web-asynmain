package org.springboot.web.lamada;

public class Person {
	
	private String name;
	
	
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	int com(String a ,String b) {
		if (a.compareTo(b)> 0) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public Person person() {
		return new Person();
	}
	
}
