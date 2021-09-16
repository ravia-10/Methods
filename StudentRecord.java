package com.xworkz.methods;

public class StudentRecord {

	// this method has parameter and no return type:

	public static void studentRecord(String usn, String name) {
		String studentUsn = "1CG16IS047";
		String studentName = "Ravi A";
		if (usn == studentUsn && name == studentName) {
			System.out.println("Student record found...");

		} else {
			System.out.println("check the usn !!! ");
		}
	}

	public static void main(String[] args) {
		String usn = "1CG16IS047";
		String name = "Ravi A";
		StudentRecord.studentRecord(usn, name);
	}
}
