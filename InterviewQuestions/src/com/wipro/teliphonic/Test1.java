package com.wipro.teliphonic;

public class Test1 {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.run();
		Thread2 thread2 = new Thread2();
		thread2.run();
	}
}
