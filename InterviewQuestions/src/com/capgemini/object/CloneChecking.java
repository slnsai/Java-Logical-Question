package com.capgemini.object;

public class CloneChecking implements Cloneable{
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneChecking checking = new CloneChecking();
		CloneChecking checking2 = (CloneChecking) checking.clone();
		
		System.out.println(checking==checking2);
		System.out.println(checking.equals(checking2));
	}

}
