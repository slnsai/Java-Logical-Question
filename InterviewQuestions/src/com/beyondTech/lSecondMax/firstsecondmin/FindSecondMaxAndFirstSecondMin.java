package com.beyondTech.lSecondMax.firstsecondmin;

public class FindSecondMaxAndFirstSecondMin {

	public static String getLargeSecondValue(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i+1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	
		return a[1]+" Second Largest Value: "+a[total-2];
	}

	public static void main(String[] args) {
		int[] a = { 12, 13, 11, 8, 6, 7, 10 };
		System.out.println("Second smallest value :" + getLargeSecondValue(a, 7));
	}
}
