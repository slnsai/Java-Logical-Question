package com.reuse.supers;

public class Employee extends Persons{
	float salary;
	public Employee(int id, String name, String desigantion,float salary) {
		super(id, name, desigantion);
		this.salary=salary;
	}
	public void display() {
		System.out.println("Id:"+id+" name:"+name+" Designation:"+desiganation+" salary:"+salary);
	}
}