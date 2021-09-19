package com.xworkz.methods;

public class TrainInformation {

	public static String trainNumber(String trainNumber) {
		String trainInformation = "Banglore to tumkur express \n"
				+ "Total Number of seats are 1200";

		return trainInformation;

	}

	public static void main(String[] args) {
		String information = TrainInformation.trainNumber("TN19836");
		System.out.println(information);
	}

}
