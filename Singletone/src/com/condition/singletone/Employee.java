package com.condition.singletone;

public class Employee {
	private static Employee instance;
	static int count = 0;

	private Employee() {

	}
	public static Employee getInstance() {
		if (instance == null) {
			instance = new Employee();
		}
		return instance;
	}
}
