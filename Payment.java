package com.gokul;

import java.time.LocalDate;
import java.util.Scanner;

public class Payment {

	public static void payment() {
		System.out.println("---------Payment Details---------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card Expiry date in format(yyyy-mm-dd):");
		String card_Expiry_Date = sc.next();
		isValidCard(card_Expiry_Date);
	}

	public static void isValidCard(String card_Expiry_Date) {
		LocalDate expiry = LocalDate.parse(card_Expiry_Date);
		LocalDate today = LocalDate.now();
		if (expiry.isBefore(today)) {
			System.out.println("--------Sorry, Card expired--------");
		} else {
			System.out.print("--------Continue to payment-----");
		}

	}
}
