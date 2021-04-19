package com.gokul;

import java.time.LocalDate;

import java.time.Period;
import java.util.Scanner;

public class Senior_Citizen {

	static int age = 0, senior_age = 0;
	static double peakval;
	static double amtaftrpk, amtaftrgst, totalAmtSenior;

	public static void senior_citizen()

	{
		System.out.println("--------Senior_Citizen Calculation-----------");
		int peakhrs = Peak_Hours.peakhr;
		double discount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date of birth in this format(yyyy-mm-dd):");
		String dob = sc.nextLine();
		age = age_calculation(dob);
		String str = Price_Estimation.cabtype;
		int km = Price_Estimation.km;
		int fare = Price_Estimation.cab_cost(str, km);
		if (isvalidAge(age)) {
			discount = (fare * 50) / 100.0;
			System.out.println("50% discount for people above 60");
			System.out.println("----discount for senior citizens is----" + discount);
			peakval = Peak_Hours.priceDuringPeak(peakhrs);
			double amtaftrpk = peakval + discount;
			System.out.println("-----Amount after peakhour value added is----- " + amtaftrpk);
			double amtaftrgst = (amtaftrpk * 7) / 100.0;
			System.out.println("-----Amount after gst added is----" + amtaftrgst + discount);
			totalAmtSenior = amtaftrgst + discount;
			System.out.println(
					"---Total amount after peak hours,senior citizen discount,gst,added is " + (totalAmtSenior));
		} else {
			System.out.println("Total amt payable is " + Peak_Hours.final_amt);
		}

	}

	public static int age_calculation(String dob) {
		LocalDate birthday = LocalDate.parse(dob);
		LocalDate today = LocalDate.now();
		System.out.println((today));
		Period p = Period.between(birthday, today);
		System.out.println("Your age is: ");
		System.out.print(p.getYears() + "years" + "  ");
		System.out.print(p.getMonths() + "months" + "  ");
		System.out.println(p.getDays() + "days" + "  ");
		senior_age = p.getYears();
		return senior_age;
	}

	public static boolean isvalidAge(int age) {
		if (age >= 60) {
			return true;
		} else {
			return false;
		}

	}
}
