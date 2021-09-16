package com.xworkz.methods;

public class Facebook {

	// this method has parameter and no return type:
	
	public static void facebookLogin(String email, String pswd) {

		String emailLogin = "facebook@gmail.com";
		String password = "facebook@password";

		if (email == emailLogin && password == pswd) {
			System.out.println("successfull logged into facebook");

		} else {
			System.out.println("incorrect email and password");
		}

	}

	public static void main(String[] args) {
		
		String email = "facebook@gmail.com";
		String password = "facebook@password";
		Facebook.facebookLogin(email, password);
	}

}
