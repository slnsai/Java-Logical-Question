package com.BhawanCyberTech.question;

import java.util.ArrayList;
import java.util.List;

public class DuplicateAddAnotherArray {

	public static void main(String[] args) {
		int[] arr = { 12,13,14,12,13,14,15,11 };

		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					list.add(arr[i]);
				}
				
			}
		}
		System.out.println(list);
	}

}
