package com.sri.single;

import java.io.Serializable;

public   class Singleton implements Cloneable,Serializable
{
	public static Singleton instance;
	static int count=0;
	private  Singleton() {
		
	}
	public static Singleton getInstance() 
	{
		if (instance==null) 
		{
			synchronized (Singleton.class) 
			{
				if (instance==null){
					instance=new Singleton() {};
				}
		}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		throw new CloneNotSupportedException("cloning is not supported");
	}
	 public Object readReslover()
	 {
		 if (instance==null) 
		 {
			 Singleton.getInstance();	
		}
		return instance;
		}
}
