package com.BhawanCyberTech.question;

public class ReversNumber {

	public static void main(String[] args) {
		int num = 12345;
		int rev = 0, sum = 0;
		while (num != 0) {
			rev = num % 10;
			num = num / 10;
			sum = sum * 10 + rev;
		}
		System.out.println(sum);
	}

}
