package com.sort.comparable;
import java.util.Set;
import java.util.TreeSet;
public class StudentComparable implements Comparable {
	public String name;
	public int age;
	public String cource;
	public StudentComparable(String name, int age, String cource) {
		super();
		this.name = name;
		this.age = age;
		this.cource = cource;
	}
	@Override
	public String toString() {
		return "StudentComparable [name=" + name + ", age=" + age + ", cource=" + cource + "]";
	}
	public static void main(String[] args) {
		StudentComparable studentComparable = new StudentComparable("Rajesh", 24, "CSE");
		StudentComparable studentComparable1 = new StudentComparable("subbu", 21, "CSE");
		StudentComparable studentComparable2 = new StudentComparable("Mahesh", 33, "M.tech");
		StudentComparable studentComparable3 = new StudentComparable("Ramesh", 20, "EEE");
		StudentComparable studentComparable4 = new StudentComparable("subhash", 25, "ECE");

		Set<StudentComparable> treeSet = new TreeSet();
		treeSet.add(studentComparable);
		treeSet.add(studentComparable1);
		treeSet.add(studentComparable2);
		treeSet.add(studentComparable3);
		treeSet.add(studentComparable4);
		treeSet.add(new StudentComparable(null, 0, null));
		for (StudentComparable object : treeSet) {
			System.out.println(object.name + "<------->" + object.age + "------------" + object.cource);
		}
	}
	public int compareTo(Object o) {
/*		if (age < studentComparable.age) {
			return 1;
		} else if (age > studentComparable.age) {
			return -1;
		} else {
			return 0;
		}
		
*/		
		StudentComparable s=(StudentComparable)o;
		int value=this.name.compareTo(s.name);
        return value;
	
		
	}
}