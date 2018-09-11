package com.gsr.services;

public class Car {
	int i;

	
	
	public Car(int i) {
		super();
		this.i = i;
	}



	public static void main(String[] args) {
		Car car = new Car(10);
		Car car2 = new Car(10);
		
		System.out.println(car.equals(car2));
	}
}
