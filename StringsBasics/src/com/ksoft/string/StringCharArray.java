package com.ksoft.string;

import java.util.stream.IntStream;

public class StringCharArray {

	public static void main(String[] args) {
			String string = new String("SurendraVunnam");
		char string1 = string.charAt(10);
		System.out.println(string1);
		
		IntStream s=string.chars();
		System.out.println(s);
			
	}

}
