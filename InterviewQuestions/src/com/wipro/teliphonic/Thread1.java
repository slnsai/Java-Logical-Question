package com.wipro.teliphonic;

import java.util.HashSet;
import java.util.Set;

public class Thread1 extends Thread {
	Set<Integer> set  = new HashSet<>();
	Thread thread = new Thread() {
		public void run() {
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 0) {
					set.add(i);
				} 
			}
		}

	};
	
	Set<Integer> set2= new HashSet<>();
	
	Thread thread1 = new Thread() {

		public void run() {
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 1) {
					set2.add(i);
				}
			}
		}
	};

	@Override
	public void run() {
		thread.start();
		thread1.start();
	}

	private void Main() {
		set.addAll(set2);
	System.out.println(set);

	}

	
}
