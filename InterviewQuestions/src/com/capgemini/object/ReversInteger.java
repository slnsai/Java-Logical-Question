package com.capgemini.object;

public class ReversInteger {

	public static void main(String[] args) {
		int input = 12345, rev = 0, sum = 0;
		int temp = input;
		while (input != 0) {
			rev = input % 10;
			input = input / 10;
			sum = sum * 10 + rev;
		}
		if (temp == sum) {
			System.out.println("Input is amosrag:" + temp);
		} else {
			System.out.println("inpiut not amostong:" + temp);
		}

		System.out.println(sum);

	}
}
