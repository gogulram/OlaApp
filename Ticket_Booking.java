package com.gokul;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Ticket_Booking {
	static String picTime, jdate;

	public static void ticket_booking() {

		System.out.println("-----------Ticket_Booking page----------");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the journeydate in this format(yyyy-mm-dd):");
		jdate = sc.next();
		isvalidDate(jdate);

		System.out.println("Enter the pickupTime in format(hh:mm:ss): ");
		picTime = sc.next();
		isvalidTime(picTime);
       
        
	}

	/**
	 * Checks for valid date
	 * 
	 * @param jdate
	 */
	public static void isvalidDate(String jdate) {
		LocalDate journeydate = LocalDate.parse(jdate);
		LocalDate currDate = LocalDate.now();
		if (journeydate.isBefore(currDate)) {
			System.out.println("------Please Enter valid date------ ");
		} else {
			System.out.println("Valid Date");
		}
	}

	/**
	 * Checks for valid time
	 * 
	 * @param picTime
	 */
	public static void isvalidTime(String picTime) {
		LocalTime cabPickupTime = LocalTime.parse(picTime);
		LocalTime currTime = LocalTime.now();
		if (cabPickupTime.isBefore(currTime)) {
			System.out.println("-----Please Enter a valid time------");
		} else {
			System.out.println("------Valid Time------");
		}
	}

}
