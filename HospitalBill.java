package com.xworkz.methods;

public class HospitalBill {

	// This method has parameter with return type:

	public static int billAmount(int bedCharge, int dressingCharge) {
		int totalAmount = bedCharge + dressingCharge;
		return totalAmount;
	}

	public static void main(String[] args) {
		int bedCharge = 300;
		int dressingCharge = 200;
		int billAmount = HospitalBill.billAmount(bedCharge, dressingCharge);
		System.out.println("total hospital bill amount is " + billAmount);
	}

}
