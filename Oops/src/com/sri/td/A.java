package com.sri.td;

public class A 
{
	public static void main(String[] args)
	{
		MyRunnable a=new MyRunnable();
		Thread thread =new Thread(a);
		thread.start();
		
		
	}

}
