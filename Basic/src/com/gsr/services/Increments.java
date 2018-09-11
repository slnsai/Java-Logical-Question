package com.gsr.services;

public class Increments {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		for (int z = 0; z < 5; z++) {
			if ((++a > 5) && (b++ > 5)) {
				System.out.println("A values:" + a + " B Vales:" + b + "   values");
			} else {
				System.out.println("A Values:" + a + " B Values:" + b);
			}
		}
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<trackingStatus><subscriptionNo>").append("SubscriptionNo")
				.append("</subscriptionNo><status>Pending</status>").append("</trackingStatus>");
		System.out.println(buffer);
		
	}

}
