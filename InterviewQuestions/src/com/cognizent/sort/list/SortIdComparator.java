package com.cognizent.sort.list;

import java.util.Comparator;

public class SortIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		/*Employee eId=o1;
		Employee eId1=o2;
		
		if(eId.geteId()<eId1.geteId()) {
			return -1;
		}else if (eId.geteId()>eId1.geteId()) {
			return 1;
		}else {
			return 0;
		}
	*/
		
		String name=o1.geteName();
		String name1=o2.geteName();
		return name.compareTo(name1);
		
	}
	

}
