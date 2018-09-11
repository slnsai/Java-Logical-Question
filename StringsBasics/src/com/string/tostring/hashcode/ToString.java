package com.string.tostring.hashcode;

public class ToString {
	int i;
	public ToString(int i) {
		this.i=i;
	}

	
	public static void main(String[] args) {
		ToString toString=new ToString(10);
		ToString toString1=new ToString(20);
		System.out.println(toString);
		System.out.println(toString1);
		
		
		//Object ==>toString Called
		//Object==>hashCode
	}

}
