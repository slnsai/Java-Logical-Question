package com.sri.comparable;

import java.util.Comparator;

public class Emp  {

	public int id;
	public String name;
	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

/*	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		
		int value=this.name.compareTo(e.name);
		return -value;
	}*/

	
	

}
