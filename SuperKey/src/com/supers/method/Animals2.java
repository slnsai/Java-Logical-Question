package com.supers.method;

public class Animals2 extends Animals{
	public void eat() {
		System.out.println("eating the Animals2");
	}
	public void bark() {
		System.out.println("bake to the Animals2");
		
	}
	public void work() {
		super.eat();
		bark();
	}
}
