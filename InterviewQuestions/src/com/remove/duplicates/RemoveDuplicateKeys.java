package com.remove.duplicates;

public class RemoveDuplicateKeys {

	public static void main(String[] args) {
		String input = "surendra";
		char ch[] = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] != ch[j]) {
					System.out.println("Values:" + ch[i]);
					break;
				}
			}
		}
	}
}