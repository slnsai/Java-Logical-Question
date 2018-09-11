package com.sri.comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class EmpData implements Comparator<Emp> {

	public static void main(String[] args) {

		TreeSet<Emp> emps = new TreeSet<>(new EmpData());
		emps.add(new Emp(7, "E"));
		emps.add(new Emp(5, "C"));
		emps.add(new Emp(2, "D"));
		emps.forEach((p) -> System.out.println(p));

	}

	@Override
	public int compare(Emp o1, Emp o2) 
	{
		String name1 = o1.name;
		String name2 = o2.name;
		return - name1.compareTo(name2);
	}

}
