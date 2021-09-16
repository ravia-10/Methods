package com.xworkz.methods;

public class ItemPrice {

	// this method has no parameter with return type

	public static double price() {
		return 45.34;
	}

	public static void main(String[] args) {
		double cost = ItemPrice.price();
		System.out.println("paper item cost is " + cost);
	}

}
