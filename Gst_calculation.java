package com.gokul;

public class Gst_calculation {

	static double gst_val, fare = 0;

	public static void gst_calculation() {
		System.out.println("------------Gst Calculator----------");
		String str = Price_Estimation.cabtype;
		int km = Price_Estimation.km;
		int fare = Price_Estimation.cab_cost(str, km);
		gst_val = gstprice(fare);
		System.out.println("Gst for this ride is " + gst_val);
		System.out.println("Total amount after gst is " + (gst_val + fare));
	}

	/**
	 * calculates the 7% GST price for the given amount
	 * 
	 * @param amt
	 * @return
	 */
	public static double gstprice(int amt) {
		fare = (amt * 7) / 100.0;
		return fare;
	}
}
