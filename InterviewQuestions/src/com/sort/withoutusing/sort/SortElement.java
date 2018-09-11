package com.sort.withoutusing.sort;

import java.util.ArrayList;
import java.util.List;

public class SortElement {

	public static void main(String[] args) {
		int[] array = new int[] { 45, 34, 23, 43, 12, 16, 24, 25 };
		List<Integer> list = new ArrayList<>();
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			list.add(array[i]);
		}
		System.out.println(list);
	}
}
