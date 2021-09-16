package com.xworkz.methods;

public class CollegeFees {
	// This method has parameter with return type:

	public static int FeesOfCollege(int busFees, int libraryFees, int collegeFees) {

		int totalFees = collegeFees + busFees + libraryFees;
		return totalFees;

	}

	public static void main(String[] args) {

		int busFees = 5000;
		int libraryFees = 2000;
		int collegeFees = 10000;
		int totalAmount = CollegeFees.FeesOfCollege(busFees, libraryFees, collegeFees);

		System.out.println("Total fees is " + totalAmount);
	}
}