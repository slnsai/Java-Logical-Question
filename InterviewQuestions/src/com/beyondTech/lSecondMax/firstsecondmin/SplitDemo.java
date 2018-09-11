package com.beyondTech.lSecondMax.firstsecondmin;

public class SplitDemo {
	public static void main(String[] args) {
		

		String s = "SOSSPSSQSSOR";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i += 2) {
			sb.append(s.substring(i, i + 2));
			if (i != s.length() - 3) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}
