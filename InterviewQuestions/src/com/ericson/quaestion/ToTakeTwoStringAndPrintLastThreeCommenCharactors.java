package com.ericson.quaestion;
//input:september,october these are inputs 
//output:ber 

public class ToTakeTwoStringAndPrintLastThreeCommenCharactors {
	public static void tofindLastThreeCommenCharactors(String str1,String str2) {
	
		String str3 =str1.substring(str1.length()-3);
		System.out.println(str3);
		if(str1.substring(str1.length()-2) == str2.substring(str2.length()-2)) {
			System.out.println(str1.substring(str1.length()-2));
		}
	
	}
	
	public static void main(String[] args) {
		ToTakeTwoStringAndPrintLastThreeCommenCharactors.tofindLastThreeCommenCharactors("septerber", "october");
	}
}
