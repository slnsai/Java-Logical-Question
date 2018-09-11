package com.cognizent.sort.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowels {

	public static void main(String[] args) {
		//1st way remove the vowels
		String input = "surendravunnam";
		String newInput=input.replaceAll("[aeiouAEIOU]", "");
		System.out.println(newInput);
		
		//2nd ways remove the vowels
		List<Character> list = new ArrayList<>();
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		list.add('A');
		list.add('E');
		list.add('I');
		list.add('O');
		list.add('U');
		
		StringBuffer stringBuffer = new StringBuffer();
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
		if(!list.contains(ch)) {
			stringBuffer.append(ch);
		}
		}
		System.out.println(stringBuffer);
	}

}
