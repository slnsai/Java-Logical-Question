package com.bnp.parbas.core;

public class Arra {

	public static void main(String[] args) {
		String temp;
		String str[] = new String[] { "surendra", "suresh", "rajesh", "maesh" };
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < (str.length - 1); j++) {
				if (myStrCmp(str[j], str[j + 1]) == 1) {
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static int myStrCmp(String a, String b) {
		int i = 0;
		int l = 0;
		int s = 0;
		int r = 0;
		if (b.length() <= a.length())
			l = b.length();
		else
			l = a.length();
		for (i = 0; i < l; i++) {
			if (a.charAt(i) > b.charAt(i)) {
				r = 1;
				break;
			}
			if (a.charAt(i) < b.charAt(i)) {
				r = -1;
				break;
			} else {
				continue;
			}
		}
		return r;
	}

}
