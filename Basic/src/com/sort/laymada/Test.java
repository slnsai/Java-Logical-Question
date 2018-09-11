package com.sort.laymada;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
			List<Student> list = new ArrayList<Student>();
			list.add(new Student(2, "apple", 23));
			list.add(new Student(3, "cat", 22));
			list.add(new Student(3, "box", 21));
			list.add(new Student(4, "banana", 24));
			
			System.out.println(list);
			//list.sort((Student s1,student s2)->s1.);
			Comparator<Student> com=(Student s1,Student s2)->s1.getName().compareTo(s2.getName());
			list.sort(com);
			System.out.println(list);
			list.forEach((student)->System.out.println(student));
	}

}
