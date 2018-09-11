package com.reuse.supers;


import org.apache.commons.collections.map.MultiValueMap;

public class Test {

	public static void main(String[] args) {
		Employee employee=new Employee(1, "surendra", "java developer", 35000f);
		employee.display();
		MultiValueMap map=new MultiValueMap();
		map.put(1, "surendra");
		map.put(1, "ramesh");
		map.put(1, "rama");
		System.out.println(map);
	}
}