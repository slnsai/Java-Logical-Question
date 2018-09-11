package com.BhawanCyberTech.question;

import java.util.ArrayList;
import java.util.List;

public class SortTheArrayList {

	public static void main(String[] args) {
		int[] arr = { 12, 13, 11, 15, 10, 8, 9,15,11 };
		int temp = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			list.add(arr[i]);
			System.out.print(arr[i] + ",");
		}
		System.out.println(list);

	}
}
