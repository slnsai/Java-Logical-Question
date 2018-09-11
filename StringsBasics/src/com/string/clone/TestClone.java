package com.string.clone;

public class TestClone implements Cloneable{
	
		int i=10;
		int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		TestClone testClone=new TestClone();
		TestClone testClone2=(TestClone) testClone.clone();
		testClone2.i=555;
		testClone2.j=666;
		
		System.out.println("i  :"+testClone.i+"...............  j :"+testClone.j);
		System.out.println("i  :"+testClone2.i+"..............  j :"+testClone2.j);
		
		
		String s1="surendra";
		String s2="vunnam";
		String s3=new String("kumar");
		String s4=new String("Vunnam");
		String s5=s1.concat("surendra").concat(s3);
		System.out.println(s5);
		
		
		StringBuffer sb=new StringBuffer("sri");
		sb.append("rama");
		System.out.println(sb);
		
		
		
		
	}

}
