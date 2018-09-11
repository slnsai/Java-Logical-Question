package com.capgemini.object;

public class PerfectSingleTone {

	private static PerfectSingleTone instance;

	private PerfectSingleTone() {
	}	
	
	public static PerfectSingleTone getInstance() {
		
		if(instance==null) {
		synchronized(PerfectSingleTone.class) {
		if(instance==null) {
			instance= new PerfectSingleTone();
		}
		}
		}
		return instance;
	}

	
	public static void main(String[] args) {
		System.out.println(getInstance().hashCode());
		System.out.println(getInstance().hashCode());
		System.out.println(getInstance().hashCode());
	}
}
