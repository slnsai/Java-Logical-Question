package com.BhawanCyberTech.question;

public class CountCharactors
{
	public static void main(String[] args)
	{
		CountCharactors.count("srinivasarao");
	}

	private static void count(String str)
	{
		String rev="";
		for (int i = 0; i < str.length(); i++) 
		{
			int count=0;
			for (int j = 0; j < str.length(); j++)
			{
				while (str.charAt(i)==str.charAt(j))
				{
					count++;
					break;
				
				}
				if(rev.indexOf(str.charAt(i)) !=-1) 
				{
					System.out.print("");
				}
				else {
					
					rev+=str.charAt(i);
					System.out.println(str.charAt(i)+"   "+count);
				}
				
			}
			
			
		}
		
	}

}
