package com.string.split;

import javax.print.DocFlavor.INPUT_STREAM;

public class SplitMethod {
	public static void main(String[] args) {

		String input = "this is Surendra";
		String[] output = input.split(" ");// split the words
		char s;
		for (String all : output) {
			s = all.charAt(0);
			System.out.print(s);
		}

		System.out.println();
		System.out.println();

		String input1 = "this,is@surendra&btech*complete hello";
		String[] output1 = input1.split("[ ,*@&]");// split the all symble words
		for (String string : output1) {
			char ch = string.charAt(1);
			System.out.print(ch);
		}

		System.out.println();
		System.out.println();

		String input2 = "welcomefortoforjava";// remove the word midle
		String[] output2 = input2.split("for");
		for (String string : output2) {
			System.out.println(string);
		}

		System.out.println();

		String input3 = "welcome@toe@javae@coding";
		String[] output3 = input3.split("[@]", -1);
		String string1 = null;
		StringBuffer stringBuffer = new StringBuffer();
		for (String string : output3) {
			string1 = string;
			stringBuffer.append(" "+string1);
		}
		System.out.print(stringBuffer);

	}
	

}
