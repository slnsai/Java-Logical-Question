package com.prodapt.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WithOutUsingComparatorUsingLaymadaExpresion {

	public int id;
	public String name;
	public int age;

	public WithOutUsingComparatorUsingLaymadaExpresion(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	

	@Override
	public String toString() {
		return "WithOutUsingComparatorUsingLaymadaExpresion [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
			List list = new ArrayList<>();
			list.add(new WithOutUsingComparatorUsingLaymadaExpresion(1, "rajesh", 23));
			list.add(new WithOutUsingComparatorUsingLaymadaExpresion(3, "subbu", 25));
			list.add(new WithOutUsingComparatorUsingLaymadaExpresion(2, "ramu", 21));
			list.add(new WithOutUsingComparatorUsingLaymadaExpresion(5, "apple", 24));
						
			Comparator<WithOutUsingComparatorUsingLaymadaExpresion> com=(WithOutUsingComparatorUsingLaymadaExpresion s1,WithOutUsingComparatorUsingLaymadaExpresion s2)->s1.getName().compareTo(s2.getName());
			list.sort(com);
			System.out.println(list);
	}
}
