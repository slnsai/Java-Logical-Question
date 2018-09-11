package com.ericson.quaestion;

import java.util.HashMap;
import java.util.Map;

//input:clasification
//output:i-3
//to find the vowel count and to return only one vowel count

public class CountVowelsAndCountOnlySingleCharactor {

	public static String finOnlySingleVowelCount(String str) {
		String input = str.toLowerCase();

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				if (map.containsKey(input.charAt(i))) {
					map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
				} else {
					map.put(input.charAt(i), 1);
				}
			}
		}
		return "i-" + map.get('i');
	}

	public static void main(String[] args) {
		String str = "clasification";
		System.out.println(CountVowelsAndCountOnlySingleCharactor.finOnlySingleVowelCount(str));
	}

}
