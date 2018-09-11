package com.ericson.quaestion;

//input:Ericson,sonies two are input Strings
//output :son print this output

public class ToTakeTwoStringAndPrintCommonThreeCharactors {

	public static String toPrintTheCommonCharactors(String str1,String str2) {
		if(str1.substring(str1.length()-2) == str2.substring(str2.length()-3)) {
			String st=str1.substring(str1.length()-2);
		
		}
		return "st2";
	}
	public static void main(String[] args) {
		String str="ericson";
		String str2= "sonies";
		ToTakeTwoStringAndPrintLastThreeCommenCharactors.tofindLastThreeCommenCharactors(str, str2);
	}
}
