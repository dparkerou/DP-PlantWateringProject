package com.techelevator.DP_Plant_Watering_Side_Project;

public class PothosPlant extends Plant {
	
	private static final int defaultPothosfrequency = 12;
	
	public static int getDefaultpothosfrequency() {
		return defaultPothosfrequency;
	}

	public PothosPlant(int frequency, int lastWatered) {
		super(defaultPothosfrequency, lastWatered);
		// TODO Auto-generated constructor stub
	}
	
	public void pothosPlantFunFact () {
		System.out.println("Fun Fact: If Pothos that have variegated leaves (leaves with bright streaks), the streaks will grow in abundance while the plant is exposed to sun.\n"
				+ "If the plant has less sun, the streaks will fade to a deep green");
	}

}
