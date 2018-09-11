package com.string.tostring.hashcode;

public class ToStringAndHashCode {
	
		int i;
		public ToStringAndHashCode(int i) {
			this.i=i;
		}
		public int hashCode() {
			return i;
		}
		public String toString() {
			return i+"";
		}
	
	public static void main(String[] args) {
		ToStringAndHashCode to=new ToStringAndHashCode(10);
		ToStringAndHashCode to1=new ToStringAndHashCode(100);
		System.out.println(to);
		System.out.println(to1);
		
	}

}
