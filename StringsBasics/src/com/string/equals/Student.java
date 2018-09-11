package com.string.equals;

public class Student {
	public int id;
	public String name;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object obj) {
		try {
			String name1=this.name;
			int id1=this.id;
			
			Student s1=(Student) obj;
			String name2=s1.name;
			int id2=s1.id;
			if(name1.equals(name2) && id1==id2) {
				return true;
			}
			else {
				return false;
			}
		}catch (ClassCastException e) {
			return false;
		}catch(NullPointerException e){
			return false;
		}
	}

	public static void main(String[] args) {
		Student student=new Student(1,"surendra");
		Student student1=new Student(2,"Ramesh");
		Student student2=new Student(1,"surendra");
		Student student3=student;
		
		System.out.println(student.equals(student1));
		System.out.println(student.equals(student2));
		System.out.println(student.equals(student3));
		System.out.println(student.equals("surendra"));
		System.out.println(student.equals("null"));
	}

}
