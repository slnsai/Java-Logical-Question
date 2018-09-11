package com.sort.comparable;

import java.util.TreeSet;

public class Empolyees  {
	public String name;
	public int age;

	public Empolyees(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Empolyees [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Empolyees empolyees = new Empolyees("surendra", 23);
		Empolyees empolyees2 = new Empolyees("rajesh", 22);
		Empolyees empolyees3 = new Empolyees("ramu", 20);
		TreeSet treeSet = new TreeSet();
		treeSet.add(empolyees);
		treeSet.add(empolyees2);
		treeSet.add(empolyees3);
		System.out.println(treeSet);
	}

	/*@Override
	public int compareTo(Empolyees obj) {
		int eid = this.age;
		Empolyees empolyees = obj;
		int eid2 = empolyees.age;
		if (eid < eid2) {
			return -1;
		} else if (eid > eid2) {
			return 1;
		} else {
			return 0;
		}

	}*/

}
