package com.sort.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator<StudentComparator> {
	public static void main(String[] args) {
		TreeSet<StudentComparator> treeSet = new TreeSet<>(new MyComparator());
		treeSet.add(new StudentComparator("suresh", 32, "EEE"));
		treeSet.add(new StudentComparator("Rajesh", 31, "EEE"));
		treeSet.add(new StudentComparator("Subbu", 21, "CSE"));
		treeSet.add(new StudentComparator("sures", 32, "CSE"));
		for (StudentComparator studentComparator : treeSet) {
			System.out.println(studentComparator.getName() + "---------" + studentComparator.getAge() + "-------"
					+ studentComparator.getCource());
		}
	}

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		/*
		 * if(o1.getAge()<o2.getAge()) { return -1; }else if (o1.getAge()>o2.getAge()) {
		 * return 1; }else { return 0; }
		 */

		String name = o1.getName();
		String name1 = o2.getName();
		return name.compareTo(name1);
		/*
		 * String name=o1.getCource(); String name1=o2.getCource(); return
		 * name.compareTo(name1);
		 */

	}

}
