package com.enoah.isolutions;

import java.util.HashMap;
import java.util.Map;

public class EmpTest {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "surendra");
		Employee employee2 = new Employee(1, "surendra");
		Map<Employee,Employee> map= new HashMap<>();
		map.put(employee, employee2);
		map.forEach((p,q)->System.out.println(p.getId()+" "+p.getName()+" "+q.getId()+""+q.getName()));
	}

}
