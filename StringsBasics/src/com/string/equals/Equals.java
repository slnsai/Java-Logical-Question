package com.string.equals;

public class Equals {
	
	int id;
	String name;
	String designation;
	
	public Equals(int id,String name,String designation) {
		this.id=id;
		this.name=name;
		this.designation=designation;
	}
	
	public boolean equals(Object obj) {
		return (this==obj);
		
	}

	public static void main(String[] args) {
		Equals equals=new Equals(1,"surendra","B.Tech");
		Equals equals1=new Equals(2,"ramesh","M.Tech");
		Equals equals2=new Equals(1, "surendra", "B.Tech");
		Equals equals3=equals;
		
		System.out.println(equals.equals(equals1));
		System.out.println(equals.equals(equals2));
		System.out.println(equals.equals(equals3));
		System.out.println(equals==equals3);
	}

}
