package org.springboot.web.vo;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
public class Dog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4827267474895563371L;

	public String name;
	
	public int age;

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
