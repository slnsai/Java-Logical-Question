package com.string.tostring.hashcode;

public class HashCode {
	
	int i;
	public HashCode(int i) {
		this.i=i;
	}
	
	public int hashCode() {
		return i;
	}
	public static void main(String[] args) {

			HashCode hash=new HashCode(10);
			HashCode hash1=new HashCode(100);
			
			System.out.println(hash);
			System.out.println(hash1);
			
			
			//Object ==>toString() Called
			//HashCode==>hashCode() Called
	
	}

}
