package com.wipro.teliphonic;

public class Thread2 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				} else {
					
				}
			}
		} catch (Exception e) {
	
		}
	}
}
