package com.capgemini.object;

public class ObjectSet {

	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=o1;
		
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));
	}

}
