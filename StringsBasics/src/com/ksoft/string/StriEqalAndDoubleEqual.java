package com.ksoft.string;

public class StriEqalAndDoubleEqual {
	public static void main(String[] args) {
		/*
		 * String s1="surendra"; 
		 * s1="vunnam"; 
		 * System.out.println(s1);
		 */
		String s1 = "surendra";
		String s2 = "surendra";
		String s3 = new String("surendra");
		String s4 = new String("surendra");
		System.out.println("String literral Object");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		System.out.println("String new Object");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println();
		System.out.println("String Literral And New Object");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
}
