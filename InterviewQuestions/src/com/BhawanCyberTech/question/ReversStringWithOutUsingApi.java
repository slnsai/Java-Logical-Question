package com.BhawanCyberTech.question;

public class ReversStringWithOutUsingApi {

	public static void main(String[] args) {
		String str = "Welcome to java script";

		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
