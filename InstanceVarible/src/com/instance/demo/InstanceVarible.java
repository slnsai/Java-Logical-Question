package com.instance.demo;

public class InstanceVarible {

	int i=10;
	public static void main(String[] args) {
		
		InstanceVarible iv=new InstanceVarible();
		
	//	System.out.println(i);//if we can declare as static 
		System.out.println(iv.i);
		iv.methodOne();
	}
	
	public void methodOne() {
		System.out.println("value is :"+i);
	}
	

}
