package org.springboot.web.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 将application.yml中的person内容和Person类属性相对性注入读取
 * 
 * 注意事项：必须要有属性的对应的get set方法，如果属性为自定义对象如果自定义对象中的属性（如Dog的name和age属性）有get方法没有set方法则启动保错无法将name设置到Person的Dog属性中，如果没有get方法则数据字段映射为空
 */
@PropertySource("classpath:application-config.yml") 
@ConfigurationProperties(prefix ="person")
@Component
public class Person implements Serializable{

	private static final long serialVersionUID = 438918458191270294L;

	private String name;
	
	private Integer age;
	
	private Boolean boos;
	
	private String brith;
	
	private Map<String,String> map;
	
	private List<String> list;
	
	private Dog dog ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getBoos() {
		return boos;
	}

	public void setBoos(Boolean boos) {
		this.boos = boos;
	}

	public String getBrith() {
		return brith;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", boos=" + boos + ", brith=" + brith + ", map=" + map
				+ ", list=" + list + ", dog=" + dog + "]";
	}
}
