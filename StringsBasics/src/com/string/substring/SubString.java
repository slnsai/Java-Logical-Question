package com.string.substring;

public class SubString {
	public static void main(String[] args) {

		String str="VunnamsurendraVunnam";
		String str2=str.substring(6);//to superate the string
		System.out.println(str2);//surendraVunnam
		
		String str3= str.substring(6, str.length()-6);
		System.out.println(str3);//surendra
	}
}
