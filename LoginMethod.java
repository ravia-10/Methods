package com.xworkz.methods;

public class LoginMethod {

	public static boolean facebookLogin(String email, String pswd) {

		String emailLogin = "facebook@gmail.com";
		String password = "facebook@password";

		if (email == emailLogin && password == pswd) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		String email = "facebook@gmail.com";
		String password = "facebook@password";
		boolean login = LoginMethod.facebookLogin(email, password);
		if (login == true) {
			System.out.println("successful login to facebook");
		} else {
			System.out.println("incorrect password!!!!");
		}

	}

}
