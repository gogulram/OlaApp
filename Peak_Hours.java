package com.gokul;

import java.time.LocalTime;

public class Peak_Hours {
	static int fareprice, peakhr;
	static double peakval, final_amt;

	public static void peak_hours() {
		System.out.println("---------Peak_Hours Calculation----------");
		String picupTime = Ticket_Booking.picTime;
		String str = Price_Estimation.cabtype;
		int km = Price_Estimation.km;
		fareprice = Price_Estimation.cab_cost(str, km);
		double peakval = 0;
		LocalTime peak = LocalTime.parse(picupTime);
		peakhr = peak.getHour();
		peakval = priceDuringPeak(peakhr);

		System.out.println("price during peakhours is " + peakval + " and total amount amount before peak hours is "
				+ fareprice + " during the time is " + peakhr);
		final_amt = fareprice + peakval;
		System.out.println("Total amount after peak hours added is " + (final_amt));

	}

	/**
	 * 1.25 percentage of fare price is calculated and returns if given time is
	 * between 17 and 19
	 * 
	 * @param peakhr
	 * @return
	 */
	public static double priceDuringPeak(int peakhr) {
		if (peakhr >= 17 && peakhr <= 19) {
			peakval = (fareprice * 1.25) / 100.0;
		}
		return peakval;
	}
}
