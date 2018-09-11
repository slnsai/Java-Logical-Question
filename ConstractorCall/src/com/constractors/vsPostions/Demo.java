package com.constractors.vsPostions;

public class Demo {
	
	private int Id;
	private String name;
	private String designation;
	
	

	public Demo(int id, String name, String designation) {
		super();
		Id = id;
		this.name = name;
		this.designation = designation;
	}

	
	@Override
	public String toString() {
		return "Demo [Id=" + Id + ", name=" + name + ", designation=" + designation + "]";
	}





	public static void main(String[] args) {
			Demo d=new Demo(1, "surendra", "B.Tech");
			Demo d1=new Demo(2, "Raju", "M.Tech");
	
			System.out.println(d);
			System.out.println(d1);
	}

}
