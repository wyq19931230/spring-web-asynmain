package org.springboot.web.lamada;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodRefenceTets {
	
	public static void main(String[] args) {
		
		Comparator<String> c = new Person() :: com;
		System.out.println(c.compare("12", "10"));
	
		Supplier<Person> ps = Person::new;
		//System.out.println(ps.get());
		set(ps.get(),  System.out::println);
		set(ps.get(),  (p) -> System.out.println());
	}
	
	public static void set (Person p ,Consumer<Person> con) {
		con.accept(p);
	}
}
