package com.statics.variables;

public class StaticMethods {
	public String name;
	public int age;
	static String colleage="QIS IT";
	
	public StaticMethods() {
		super();
	}
	public StaticMethods(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	static void change() {
		colleage="QIS CET";
	}
	public void display() {
		System.out.println(name+"---"+age+"---"+colleage);
	}
	
	public static void main(String[] args) {
		StaticMethods.change();
		StaticMethods staticMethods=new StaticMethods();
		staticMethods.display();
		
		/*StaticMethods staticMethods = new StaticMethods("Raju", 23);
		StaticMethods staticMethods2 = new StaticMethods("Suresh", 25);
		staticMethods.display();
		staticMethods2.display();*/
	}
}
