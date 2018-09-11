package com.capgemini.object;

public class CountNumbers {

	public static void main(String[] args) {
		int count = 0;
		int numbers = 12345;
		/*
		 * String string = String.valueOf(numbers); for(int i=0;i<string.length();i++) {
		 * count++; }
		 */
		while (numbers > 0) {
			numbers = numbers / 10;
			System.out.println(numbers);
			count++;

		}
		System.out.println(count);
	}

}
