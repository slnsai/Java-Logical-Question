package com.string.chars;

import java.util.HashSet;
import java.util.Set;

public class Characators {

	public static void main(String[] args) {
		String str="helloWorld";
		
		char[] str1=str.toCharArray();
		System.out.println(str1);
		Set<Character> set=new HashSet<>();
		for(Character ch:str1) {
			set.add(ch);
		}
		System.out.println(set);
		
		StringBuffer stringBuffer=new StringBuffer();
		for(Character ch1:set) {
			stringBuffer.append(ch1);
		}
		System.out.println(stringBuffer);
		
		
		
		
	}
}
