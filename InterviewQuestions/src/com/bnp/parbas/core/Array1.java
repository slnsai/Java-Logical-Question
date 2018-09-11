package com.bnp.parbas.core;

public class Array1 {

	public static void main(String[] args) {
		String temp;
		String str[] = new String[] { "suresh", "rajesh", "cat", "dog", "elephant" };
		for (int i = 0; i < str.length; i++) // Outer loop -similar to bubble sort which takes O(N2) operations
		{
			for (int j = 0; j < str.length; j++) // inner loop
			{

				if (myStrCmp(str[i], str[j]) > 0) // using string comparision method
				{
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

		for (int i = 0; i < str.length; i++)// display the sorted array
		{
			System.out.println(str[i]);
		}

	}

	public static int myStrCmp(String a, String b)// without using string comparision- Needed some corrections..
	{
		int i = 0;
		int l = 0;
		//int s = 0;
		int r = 0;
		if (a.length() >= b.length())
			l = b.length();
		else
			l = a.length();

		for (i = 0; i < l; i++) {
			if (a.charAt(i) > b.charAt(i)) // if this method is used then total operations or algorithm complexity is
											// O(N3)
			{
				r = 1;
				break;
			}

		}
		return r;

	}

}
