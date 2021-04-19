package com.gokul;

public class Billing_Details {

	 public static void billing()
	    {   System.out.println();
		    System.out.println("---------Billing Details---------");
	    	System.out.println("----car type---->"+Price_Estimation.cabtype);
	    	System.out.println( "*****");
	    	System.out.println("----JourneyDate----"+Ticket_Booking.jdate);
	    	System.out.println( "*****");
	    	System.out.println("----PickupTime----"+Ticket_Booking.picTime);
	    	System.out.println( "*****");
	    	if(Senior_Citizen.age>=60)
	    		System.out.println("----Total Amount Payable is ----"+Senior_Citizen.totalAmtSenior);
	    	else
	    		System.out.println("----Total Amount Payable is ----"+Peak_Hours.final_amt);
	    	
	    	
	    }
}
