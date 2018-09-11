package com.sri.td;

class MyThread extends Thread
{
	
}
public class B 
{

		public static void main(String[] args)
		{
			MyRunnable a=new MyRunnable();
			Thread thread =new Thread(a);
			System.out.println(thread.currentThread().getName());
			System.out.println(new MyThread().isDaemon());
			System.out.println();
			thread.start();
			
			
		}


}
