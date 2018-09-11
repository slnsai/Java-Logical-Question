package com.string.revers;

import java.util.HashMap;
import java.util.Map;

public class ReverString {

	public static void main(String[] args) {
			String input="surendravunnam";
			char[] ch=input.toCharArray();
			
			for(int i=ch.length-1;i>=0;i--) {
				System.out.print(ch[i]);
			}
			
			Map<Character, Integer> map=new HashMap<>();
		
	}

}
