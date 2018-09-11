package com.condition.singletone;

public class Employee1 {

	public static void main(String[] args) {
		System.out.println(Employee.getInstance().hashCode());
		System.out.println(Employee.getInstance().hashCode());
		System.out.println(Employee.getInstance().hashCode());
		System.out.println(Employee.getInstance().hashCode());
		System.out.println(Employee.getInstance().hashCode());
		System.out.println(Employee.getInstance().hashCode());
	}

}
