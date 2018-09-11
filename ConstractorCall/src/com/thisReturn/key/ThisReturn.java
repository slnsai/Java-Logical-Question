package com.thisReturn.key;

public class ThisReturn {
	
	public ThisReturn getThis() {
		return this;
	}
	public void mes() {
		System.out.print("Hellow Java");
	}

	public static void main(String[] args) {
		ThisReturn th=new ThisReturn();
			th.getThis().mes();
	}

}
