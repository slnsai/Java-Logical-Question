package com.array.list;

public class CompareToString {
	public int toCompare(String s1, String s2) {
		int i,j;
		for (i = 0; i < s1.length(); i++) {
			for (j = 0 + 1; j < s2.length(); j++) {
				if (s1.charAt(i) < s2.charAt(j)) {
					return 1;

				} else if (s1.charAt(i) > s2.charAt(j)) {
					return -1;
				} else {
					return 0;
				}
			}
		}
		return s1.charAt(i);

	}
}
