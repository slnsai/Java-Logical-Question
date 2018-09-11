package com.eginvocation.returntest;

import java.util.Vector;

public class VectorLoop {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<>();
	//Vector<Integer> v; this is execption throws
	for(int i=1;i<5;i++) {
		v.addElement(i);
	}
	System.out.println(v);
}
}
