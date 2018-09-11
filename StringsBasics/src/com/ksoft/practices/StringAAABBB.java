package com.ksoft.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.prefs.BackingStoreException;

public class StringAAABBB {

	public static void main(String[] args) {
		
		String input="AAABBBAAABBB";
		char[] ch1=input.toCharArray();
		List<Character> list=new ArrayList<>();
		for(int i=0;i<ch1.length;i++) {
			list.add(ch1[i]);
		}
		Collections.sort(list);
		System.out.println(input);
			
		StringBuffer buffer=new StringBuffer();
		for(Character ch2:list) {
			buffer.append(ch2);
		}
		//System.out.println(buffer);
		
		for(int i=0;i<list.size()-6;i++) {
			String output = buffer.substring(5, 7);
			System.out.print(output);
		}
		
		
		
		
		
		
	}

}
