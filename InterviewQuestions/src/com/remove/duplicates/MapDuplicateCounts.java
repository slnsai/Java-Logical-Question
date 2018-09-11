package com.remove.duplicates;

import java.util.HashMap;
import java.util.Map;

public class MapDuplicateCounts {

	public static void main(String[] args) {

		String input = "surendra";
		char[] ch = input.toCharArray();
		int count = 0;
		Map<Character, Integer> map=new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				count=map.get(ch[i]);
				count++;
				map.put(ch[i], count);
			}else {
				map.put(ch[i], 1);
			}

		}
		System.out.println(map);
		
	for(Map.Entry<Character, Integer>  e:map.entrySet())
	{
		System.out.println(e.getKey()+"................."+e.getValue());
	}
	}

}
