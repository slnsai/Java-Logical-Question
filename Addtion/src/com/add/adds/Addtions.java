package com.add.adds;

public class Addtions {
	
		public Addtions() {
			
		}
		public Addtions(int i,int j) {
			System.out.println(i+j);
		}
		public int adds(int i,int j) {
			return i+j;
		}
		public static int addtions(int i,int j) {
			return i+j;
		}

	public static void main(String[] args) {
		Addtions addtions=new Addtions(10, 20);
		Addtions addtions2=new Addtions();
		System.out.println(addtions2.adds(10, 20));
		System.out.println(Addtions.addtions(10, 20));
	}

}
