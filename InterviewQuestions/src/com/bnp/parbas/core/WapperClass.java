package com.bnp.parbas.core;

public class WapperClass {
	static Integer a = 10;// we can not use direct goble variable

	public static void main(String[] args) {
		int b = a;
		System.out.println(b);
	}
	// auto boxing :Converting a primitive value into an object of the corresponding
	// wrapper class is called autoboxing. For example, converting int to Integer
	// class. The Java compiler applies autoboxing when a primitive value is
	
	
	// auto unboxing:Converting an object of a wrapper type to its corresponding
	// primitive value is called unboxing. For example conversion of Integer to int.
	// The Java compiler applies unboxing when an object of a wrapper class is

}
