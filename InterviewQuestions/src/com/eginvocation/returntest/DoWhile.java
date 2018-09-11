package com.eginvocation.returntest;

public class DoWhile {
	public static void main(String[] args) {
		int[] a = new int[5];
		int i=0;
		int j=2;
		do {
			i=++i;
			j--;
		}while(j>0);
			System.out.println(a[i]);
		
	}

}
