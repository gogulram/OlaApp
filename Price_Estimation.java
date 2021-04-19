package com.gokul;

import java.util.*;
import java.util.Scanner;

public class Price_Estimation {
	static int fare, fare1 = 0, km;
	static String cabtype;

	public static void price_estimation() {
		System.out.println("--------Price_Estimation-------------");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your preferred car type:  ");
		cabtype = sc1.next();
		System.out.println("--------");
		System.out.println("Enter the number of kilometers:  ");
		km = sc1.nextInt();
		chooseCabtype(cabtype, km);
		

	}

	/**
	 * calculate the price for given kilometers return price
	 * 
	 * @param kmval
	 * @return
	 */
	public static int microPrice(int kmval) {
		fare = kmval * 10;
		return fare;
	}

	public static int miniPrice(int kmval) {
		fare = kmval * 15;
		return fare;
	}

	public static int primePrice(int kmval) {
		fare = kmval * 20;
		return fare;
	}

	/**
	 * Prints the price for specific ride
	 * 
	 * @param cabtype
	 * @param km
	 */
	public static void chooseCabtype(String cabtype, int km) {
		if (cabtype.equalsIgnoreCase("micro")) {
			fare1 = functions.microPrice(km);
			System.out.println("Total amount before tax is " + fare1);
			// Peak_Hours.peak_hours(fare1);
		} else if (cabtype.equalsIgnoreCase("mini")) {
			fare1 = functions.miniPrice(km);
			System.out.println("Total amount before tax is " + fare1);

		} else if (cabtype.equalsIgnoreCase("prime")) {
			fare1 = functions.primePrice(km);
			System.out.println("Total amount before tax is " + fare1);

		}
	}

	public static int cab_cost(String cabtype, int km) {
		if (cabtype.equalsIgnoreCase("micro")) {
			fare1 = microPrice(km);
			return fare1;
		} else if (cabtype.equalsIgnoreCase("mini")) {
			fare1 = miniPrice(km);
			return fare1;
		} else if (cabtype.equalsIgnoreCase("prime")) {
			fare1 = primePrice(km);
			return fare1;
		}
		return 0;
	}
}
