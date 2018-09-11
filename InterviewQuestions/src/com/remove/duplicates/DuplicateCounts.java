package com.remove.duplicates;

public class DuplicateCounts {

	public static void main(String[] args) {

		String name = "surendravunnam";
		String rev = "";
		for (int i = 0; i < name.length(); i++) {
			int count = 0;
			for (int j = 0; j < name.length(); j++) {
				while (name.charAt(i) == name.charAt(j)) {
					count++;
					break;
				}
			}
			if (rev.indexOf(name.charAt(i)) != -1) {
				System.out.print("");
			} else {
				rev += name.charAt(i);
				System.out.println("character = " + name.charAt(i) + " and count is = " + count);
			}
		}
	}

}
