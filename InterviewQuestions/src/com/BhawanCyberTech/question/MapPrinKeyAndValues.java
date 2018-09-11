package com.BhawanCyberTech.question;

import java.util.HashMap;
import java.util.Map;

public class MapPrinKeyAndValues {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "surendra");
		map.put(2, "rajesh");
		map.put(3, "ramu");
		
		System.out.println(map);
		map.forEach((k,v)->{
			System.out.println("key Value:"+k+"  ....   value:"+v);
		}
		);
	}
}
