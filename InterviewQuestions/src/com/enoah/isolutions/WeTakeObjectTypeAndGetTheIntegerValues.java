package com.enoah.isolutions;

import java.util.ArrayList;
import java.util.List;

public class WeTakeObjectTypeAndGetTheIntegerValues {

	public static void main(String[] args) {
		List<Object> list =new ArrayList<>();
		list.add(12);
		list.add("surendra");
		list.add(11);
		list.add("rajesh");
		list.add(13);
		list.add("subbu");
		System.out.println(list);
		for (Object object : list)
		{
			/*if (object instanceof Integer) 
			{
				System.out.println(object);
			}*/
			if (object instanceof String) 
			{
				System.out.println(object);
			}
		}
		
	}
}
