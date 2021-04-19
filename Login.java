package com.gokul;

import java.util.Scanner;

public class Login {
	/**
	 * gets mobile number and password from the user and checks valid or not
	 */
	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Login Page Ola ----------");
		System.out.println("Enter your mobile number:");
		Long Mobnum = sc.nextLong();
		if (isvalidmobnum(Mobnum)) {
			System.out.println("Its a valid Number, You can Continue");
		} else {
			System.out.println("----Invalid number-----");
			System.out.println("Please Enter a Valid Number");

		}

		System.out.println("Enter your password:");
		String password = sc.next();
	    if (isvalidpasswrd(password)) {
			System.out.println("-----Password must contain 8 letters---");
		} else {
			System.out.println("*******Sucessfully Logged in********");
		}
	
	}

	/**
	 * This method will return true if number is equal to 10 digits Else it returns
	 * false
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isvalidmobnum(Long num) {
		String mobstr = String.valueOf(num);
		if (mobstr.length() != 10) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * checks the length of the string(password)greater than or equal to 8 returns
	 * true if condition is true else false
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isvalidpasswrd(String str) {
		String mobstr = String.valueOf(str);
		if (mobstr.length() < 8) {
			return false;
		} else {
			return true;
		}
	}
}
