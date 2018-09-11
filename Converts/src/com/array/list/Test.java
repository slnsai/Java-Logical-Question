package com.array.list;

public class Test {

	public static void main(String[] args) {
		/*
		 * CompareToString compareToString = new CompareToString();
		 * compareToString.toCompare("surendra","rajesh");
		 */
		String name = "surendra";
		String name1 = "surendra";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < name1.length(); j++) {

				if (name.charAt(i) != name1.charAt(j)) {
					count++;
					//System.out.println(name.charAt(i)+".."+ name1.charAt(j));
					System.out.println("true");
				}else {
					System.out.println(name.charAt(i)+".."+name1.charAt(j));
				}
			}

		}
		System.out.println(count);

	}

}
