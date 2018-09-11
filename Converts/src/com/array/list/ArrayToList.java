package com.array.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		String[] input = new String[] { "surendra", "rajesh", "subbu", "mahesh" };
		for (String values : input) {
			System.out.println(values);
		}

		List<String> list = Arrays.asList(input);
		System.out.println();
		for(String value1:list) {
			System.out.println(value1);
		}
		
		System.out.println();
				
	}

}
