package com.string.concat;

public class ConcatMethod {
	public static void main(String[] args) {
		String str="surendra";
		String str1=new String("vunnam");
		String str2=str.concat(str1);
		System.out.println(str2);
		String str3= str2.concat(" is java Developer");
		
		System.out.println(str3);
	}
}

