package com.bnp.parbas.core;

public class FindIncresingValues {

	public static void main(String[] args) {
			int[] input= {2,23,4,7,30,24,33,40};
			int max=0;
			for(int i=0;i<input.length;i++) {
				if(max<=input[i]) {
					System.out.print(input[i]+",");
					max=input[i];
				}
			}
	}

}
