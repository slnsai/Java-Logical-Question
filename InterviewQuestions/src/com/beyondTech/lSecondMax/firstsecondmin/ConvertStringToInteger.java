package com.beyondTech.lSecondMax.firstsecondmin;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		String str="23";
		Integer integer = Integer.parseInt(str);
		System.out.println(integer);
	
		String str2 = "123";
		Integer integer2 = Integer.valueOf(str2);
		System.out.println(integer2);
		
		Integer surendra = 233;
		String str3 = String.valueOf(surendra);
		System.out.println(str3);
	}

}
