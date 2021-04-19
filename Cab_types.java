package com.gokul;

public class Cab_types {
	/**
	 * Shows the available cab types
	 */
	public static void cab_types() {
		// TODO Auto-generated method stub
		System.out.println("-----------Cab Types---------");
		String[] cabTypes = new String[3];
		cabTypes[0] = "    1:micro-(10rupees km/hr)";
		cabTypes[1] = "    2:mini-(15rupees km/hr)";
		cabTypes[2] = "    3:prime-(20rupees km/hr)";
		System.out.println("Number of cars available are: ");
		System.out.println("-----> " + cabTypes.length);
		System.out.println("Types of car available are: ");
		for (String car : cabTypes) {
			System.out.println("  " + car);
		}

	}

}
