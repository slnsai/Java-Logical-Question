package com.thisReturn.same;

public class SameObj {
	
	public void m1() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		SameObj obj=new SameObj();
		System.out.println(obj);
		obj.m1();
	}

}
