package com.ericson.quaestion;

import java.util.HashMap;
import java.util.Map;

//input:perason
//output:a-1
//to find out only vowels and count
public class CountVowelsOnlyDeplayOneVowelCount {
	public static void displayOneVowel(String str) {
		String str1 = str.toLowerCase();
		char[] ch=str1.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u') {
				if(map.containsKey(str1.charAt(i))) {
					map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
				}else {
					map.put(str1.charAt(i), 1);
				}
				
			}
		}
		System.out.println(map);
		System.out.println("a-"+map.get('a'));
		
	}
	public static void main(String[] args) {
		String str="perason";
		CountVowelsOnlyDeplayOneVowelCount.displayOneVowel(str);
	}

}
