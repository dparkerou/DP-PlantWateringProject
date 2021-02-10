package com.techelevator.DP_Plant_Watering_Side_Project;

public class SpiderPlant extends Plant {
	//Instance Variable
	private static final int defaultSpiderfrequency = 7;
	//Getter
	public static int getDefaultSpiderFrequency() {
		return defaultSpiderfrequency;
	}
	//Constructor
	public SpiderPlant(int frequency, int lastWatered) {
		super(defaultSpiderfrequency, lastWatered);
	}
	public void spiderPlantFunFact () {
		System.out.println("Fun Fact: Spider plants are great indoor air cleaners and 15 spider plants would purify the air of an average sized house.");
	}
}
