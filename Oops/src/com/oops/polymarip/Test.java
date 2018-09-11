package com.oops.polymarip;

public class Test {
	
	public static void main(String[] args) {
		 Bank bank;
		 
		 bank=new Bank();
		 System.out.println(bank.getInterest());
		 		bank=new Sbi();
		 		System.out.println("Sbi Banking:"+bank.getInterest());
		 		bank=new Icici();
		 		System.out.println("Icici Banking:"+bank.getInterest());
		 		bank=new Hdfc();
		 		System.out.println("Hdfc Banking:"+bank.getInterest());		 		
	}

}
