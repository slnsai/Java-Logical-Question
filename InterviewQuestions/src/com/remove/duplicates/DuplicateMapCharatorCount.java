package com.remove.duplicates;

import java.util.HashMap;

public class DuplicateMapCharatorCount {

	public static void main(String[] args) {
		String line = "surendravunnam";
		
		int count;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < line.length(); i++) {
			if (map.containsKey(line.charAt(i))) {
				count = map.get(line.charAt(i));
				count++;
				map.put(line.charAt(i), count);
			} 
			else {
				map.put(line.charAt(i), 1);
			}
		}
		System.out.println(map);
		for (Character key : map.keySet()) {
			System.out.println("Character : '" + key + "' Count :" + map.get(key));
		}

	}

}
