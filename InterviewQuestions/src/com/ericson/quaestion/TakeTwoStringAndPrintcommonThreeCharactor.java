package com.ericson.quaestion;

//input:Monday,sunday take these two string and print three common latter
//output:day

public class TakeTwoStringAndPrintcommonThreeCharactor {

	public static String toPrintCommonCharactors(String str1, String str2) {
		if (str1.substring(str1.length() - 2) == str2.substring(str2.length() - 2)) {
			String str3 = str1.substring(str1.length() - 2);
		}
		return "str3";
	}

	public static void main(String[] args) {
		String str = "monday";
		String str1 = "sunday";
		ToTakeTwoStringAndPrintLastThreeCommenCharactors.tofindLastThreeCommenCharactors(str, str1);
	}
}
