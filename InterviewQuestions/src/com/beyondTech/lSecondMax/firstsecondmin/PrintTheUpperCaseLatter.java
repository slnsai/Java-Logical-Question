package com.beyondTech.lSecondMax.firstsecondmin;

import java.util.ArrayList;
import java.util.List;

public class PrintTheUpperCaseLatter {

	public static void main(String[] args) {
		String str = "WelComeToSuREnDra";
		
		int count=0;
		List<Character> list = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
				list.add(str.charAt(i));
			} else {
				list2.add(str.charAt(i));
			}
		}
		System.out.println("Upper case Letter count : "+count );
		System.out.println("Upper Case :"+list);
		System.out.println("Lower case :"+list2);
		
	}

}
