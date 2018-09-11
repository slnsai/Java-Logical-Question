package com.string.tostring;

public class ToString {
	int Id;
	String name;
	String desiganation;
	
	public ToString(int Id,String name,String desiganation) {
		this.Id=Id;
		this.name=name;
		this.desiganation=desiganation;
	}
	
	/*Internal Flow of toString 
	 * public String toString() {
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}*/
	
	public String toString() {
		return "Id :"+Id+"  name:"+name+"  desigantion:"+desiganation;
	}
	
	public static void main(String[] args) {
		ToString toString=new ToString(1,"surendra","java");
		ToString toString1=new ToString(2,"Raju","Orcle");
		System.out.println(toString);
		System.out.println(toString1);
	}

}
