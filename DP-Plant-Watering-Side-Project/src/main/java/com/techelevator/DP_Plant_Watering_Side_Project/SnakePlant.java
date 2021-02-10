package com.techelevator.DP_Plant_Watering_Side_Project;

public class SnakePlant extends Plant {
	private static final int defaultSnakefrequency = 19;
	public SnakePlant(int frequency, int lastWatered) {
		super(defaultSnakefrequency, lastWatered);
		
	}

	public static int getDefaultsnakefrequency() {
		return defaultSnakefrequency;
	}

	public void snakePlantFunFact () {
		System.out.println("Fun Fact: Beyond its scientific name and “bedroom” nickname, the snake plant is also known as Mother-in-Law’s Tongue, Devil’s Tongue,\n Bowstring Hemp, and variations of the Good Luck or Lucky Plant.");
	}
}
