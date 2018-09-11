package com.eginvocation.returntest;

import java.util.ArrayList;
import java.util.List;

public class ArraysExecption {
	public static void main(String[] args) {
			List<Integer> list = new ArrayList<>(3); 
			for(int i=1;i<5;i++) {
				list.add(i);
			}
			System.out.println(list);
	}
}
