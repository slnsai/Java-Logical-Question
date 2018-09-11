package com.remove.duplicates;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactorRemove {

	public static void main(String[] args) {
		
		String input="surendravunnam";
		char[] ch=input.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		Set<Character> set=new HashSet<>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
		
		StringBuffer stringBuffer=new StringBuffer();
		for(Character ch1:set) {
			stringBuffer.append(ch1);
			
		}
		System.out.println(stringBuffer);
	}

}
