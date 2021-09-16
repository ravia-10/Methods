package com.xworkz.methods;

public class WeightOfItem {

	// This method has parameter with return type:

	public static double weightOfBox() {
		return 9.18;
	}

	public static void main(String[] args) {
		double gram = WeightOfItem.weightOfBox();
		System.out.println("weight of box is " + gram + "g");
	}

}
