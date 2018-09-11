package com.BhawanCyberTech.question;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharactorsCount {

	public static void main(String[] args) {
		String str = "aaabcbcbc";
		String input = str.toLowerCase();
		char[] ch = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (Character ch1 : ch) {
			if (map.containsKey(ch1)) {
				map.put(ch1, map.get(ch1) + 1);//count the duplicatecharctors 
				//map.remove(ch1);// duplicate charactor are remove
			} else {
				map.put(ch1, 1);
			}
		}
		System.out.println("a-" + map.get('a'));
		System.out.println(map);
		Set<Character> set = map.keySet();
		for (Character ch2 : set) {
			if (map.get(ch2) > 1) {
				System.out.println(ch2 + "......." + map.get(ch2));
			}
		}

	}
}