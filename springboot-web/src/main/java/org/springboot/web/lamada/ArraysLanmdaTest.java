package org.springboot.web.lamada;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysLanmdaTest {
	
	public static void main(String[] args) {
		test();
	}
	public static void  test() {
		List<String> list = Arrays.asList("1","2","","1","3");
		
		list.parallelStream().filter(s-> !s.isEmpty()).mapToInt(s -> Integer.parseInt(s)).distinct().forEachOrdered(System.out::println);
		//System.out.println(c);
		Map<String,String> map = new HashMap<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("5", "c");
		map.put("3", "d");
		map.entrySet().parallelStream().filter((e)->
			{
			return e.getKey() != null;
			});
		
		//map.entrySet().parallelStream().sorted(Comparator.comparing(e->e.getKey())).forEachOrdered(e->map.put(e.getKey(), e.getValue()));
	//System.out.println(map);
	//map.entrySet().parallelStream().forEachOrdered(System.out::println);
		map.entrySet().parallelStream().sorted(Map.Entry.<String,String>comparingByKey().reversed()).forEachOrdered(System.out::println);;
	}
}
