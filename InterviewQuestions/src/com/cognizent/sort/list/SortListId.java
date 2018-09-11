package com.cognizent.sort.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListId {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(3, "suresh", 2000f));
		list.add(new Employee(2, "rejesh", 15000f));
		list.add(new Employee(5, "kumar", 30000f));
		list.add(new Employee(8, "subbu", 20000f));

		Employee employee = new Employee();
		Collections.sort(list, new SortIdComparator());
		
		for(Employee list1:list) {
			System.out.print(list1);
		}
	}

}

 
