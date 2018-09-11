package com.sri.sub;

import com.sri.single.Singleton;

public class Child2
{
	{
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
		
	}

}
