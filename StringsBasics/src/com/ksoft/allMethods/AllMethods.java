package com.ksoft.allMethods;

public class AllMethods {

	public static void main(String[] args) {

		String input = "surendravunnam";
		String input1= "surrennann";
		String input2 = "suRENDraVuNNam";
		String input3= " this is Surendra ";
		String input4 = "this is Surendra";
		
		String[] output10 = input4.split(" ");//split the words in paragraph
		
		for(String in:output10) {
			
			char ins=in.charAt(0);

		System.out.print(ins);
		}
		System.out.println();
		
		String output9 = input3.trim(); //remove the spaces out side  
		String output = input.concat(" kumar");
		String output1 = input.substring(10);
		String output2 = input.substring(10, 12);
		String output3 = input.intern();
		String output4 = input.replace('u', 'e');
		String output5 = input1.replaceAll("rr", "yy");
		String output6 = input1.replaceFirst("nn", "");
		String output7 = input2.toLowerCase();
		String output8 = input2.toUpperCase();
		

		System.out.println(output);
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
		System.out.println(output4);
		System.out.println(output5);
		System.out.println(output6);
		System.out.println(output7);
		System.out.println(output8);
		System.out.println(output9);

	}


}
