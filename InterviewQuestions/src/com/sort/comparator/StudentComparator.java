package com.sort.comparator;


public class StudentComparator {

	private String name;
	private int age;
	private String cource;

	public StudentComparator(String name, int age, String cource) {
		super();
		this.name = name;
		this.age = age;
		this.cource = cource;
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


	public String getCource() {
		return cource;
	}


	public void setCource(String cource) {
		this.cource = cource;
	}


	@Override
	public String toString() {
		return "StudentComparator [name=" + name + ", age=" + age + ", cource=" + cource + "]";
	}	
}