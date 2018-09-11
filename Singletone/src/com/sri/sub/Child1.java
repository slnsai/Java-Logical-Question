package com.sri.sub;

import com.sri.single.Singleton;

public class Child1
{
	public static void main(String[] args)
	{
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
		
	}
	

}
