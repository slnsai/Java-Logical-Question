package com.string.interviews;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceVaribles {	
	public static void main(String[] args) {
			String string="java";
			String core="core";
			System.out.println("s Value:"+string+"   core Value:"+core);
			
			string=string+core;
		
			core=string.substring(0, string.length()-core.length());
			string=string.substring(core.length());
			System.out.println("S Value:"+string+"   core Value:"+core);
			
			//with out using replce method 	
			String s="surendra";
			char[] ch=s.toCharArray();
			
			char ch1= 'r';
			for(int i=0;i<ch.length;i++) {
					if(ch[i]==ch1) {
						System.out.print("a");
					}else {
						System.out.print(ch[i]);
					}
			}
			
			
			String account="(Foo1A)surendra";
			
			String str=account.substring(1, account.length()-1);
			boolean s1=account.endsWith("surendra");
			System.out.println(s1);
			System.out.println(str);
			
			
			
			
			
		}
			
			

}
