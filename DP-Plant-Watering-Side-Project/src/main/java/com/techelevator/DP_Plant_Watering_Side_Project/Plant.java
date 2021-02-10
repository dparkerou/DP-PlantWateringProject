package com.techelevator.DP_Plant_Watering_Side_Project;

public class Plant {
	//Instance Variables
	private int lastWatered; //How many days it's been since last watered
	private int frequency;
	private int daysToWater;
	private boolean isDry;

	public boolean isDry() {
		return isDry;
	}
	//Getters and Setters
	public int getLastWatered() {
		return lastWatered;
	}
	public void setLastWatered(int lastWatered) {
		this.lastWatered = lastWatered;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getDaysToWater(int frequency, int lastWatered) {
		daysToWater = frequency - lastWatered; 
		return daysToWater;
	}
	
	//Constructor
	
	public Plant (int frequency, int lastWatered) {
		this.lastWatered = lastWatered;
		this.frequency = frequency;
	}
	
	//Methods
	public boolean checkSoil(boolean isDry, int lastWatered) {
		if (isDry == true) {
			System.out.println("Time to Water!");	
		}
		else if (!isDry && daysToWater > 0) {
			System.out.println("Check back again in " + daysToWater + " days.");
			return false;
		}
		else {
			System.out.println("Check back again in a few days.");
			return false;
		}
		return true;
	}
}
