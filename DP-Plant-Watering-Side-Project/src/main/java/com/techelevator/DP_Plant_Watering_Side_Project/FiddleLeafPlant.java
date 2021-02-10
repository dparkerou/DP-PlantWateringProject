package com.techelevator.DP_Plant_Watering_Side_Project;

public class FiddleLeafPlant extends Plant {

	//Instance Variable
		private static final int defaultFiddlefrequency = 12;
		//Getter
		public static int getDefaultFiddleFrequency() {
			return defaultFiddlefrequency;
		}
		//Constructor
		public FiddleLeafPlant(int frequency, int lastWatered) {
			super(defaultFiddlefrequency, lastWatered);
		}
		public void fiddlePlantFunFact () {
			System.out.println("Fun Fact: Grown outdoors, the fiddle leaf fig can grow up to 49 feet in height, while indoors it can reach heights of around 9 feet.");
		}
		public int itIsWinter() {
			int newFrequency = defaultFiddlefrequency + 7;
			return newFrequency;
		}
		
}
