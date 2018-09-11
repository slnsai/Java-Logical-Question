package com.statics.variables;

public class StaticVarible {

	private String name;
	private int age;
	static String colleage = "QIS IT";

	public StaticVarible(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "name:" + name + " Age:" + age + " Collage:" + colleage;
	}

	public static void main(String[] args) {
		StaticVarible staticVarible= new StaticVarible("Rajesh", 24);
		StaticVarible staticVarible2=new StaticVarible("Suresh", 23);
		System.out.println(staticVarible);
		System.out.println(staticVarible2);
	}
}
