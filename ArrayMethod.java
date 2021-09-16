package com.xworkz.methods;

public class ArrayMethod {

	public static void arrayEvenNumber(int arrayEvenNumber[]) {

		for (int i = 0; i < arrayEvenNumber.length; i++) {
			
			if (arrayEvenNumber[i] % 2 == 0) {

				System.out.println("even number is :" + arrayEvenNumber[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		int arrayEvenNumber[] = {0,1,2,3,4,5,6,7,8,9,10,12,11,13,14,15,16,17,18,19,20};
		
		ArrayMethod.arrayEvenNumber(arrayEvenNumber);
	}

}
