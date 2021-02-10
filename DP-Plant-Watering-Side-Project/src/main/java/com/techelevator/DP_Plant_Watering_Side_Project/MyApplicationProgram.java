package com.techelevator.DP_Plant_Watering_Side_Project;

import java.util.Scanner;

public class MyApplicationProgram {
	
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// Step 1 : Intro
		System.out.println("Welcome to the program designed to save hundreds of innocent plant lives!");
		System.out.println("What type of Houseplant do you have?");
		System.out.println("[1] Spider Plant");
		System.out.println("[2] Fiddle Leaf Fig");
		System.out.println("[3] Pothos");
		System.out.println("[4] Snake Plant");
		System.out.println("[5] I have no idea");
		
		//store type of house plant into userChoice
		int userChoice = Integer.parseInt(userInput.nextLine()); 
		
		//if the user chooses 5, send them to the website, otherwise continue to when they last watered
		if (userChoice == 5) {//way to make the text on the new line sit flush with the other line?
			System.out.println("No worries! Check out https://davesgarden.com/guides/pf/ for identification guides and care details.\nIf you discover your plant is listed above, come back and we'll tell you when to water it!");
		} else 
			System.out.println("How many days has it been since you last watered your houseplant?");
		
		//store last time watered into daysSinceWatered
		int daysSinceWatered = Integer.parseInt(userInput.nextLine());
		
		switch (userChoice) {
		case 1://Spider Plant
			SpiderPlant spider = new SpiderPlant(SpiderPlant.getDefaultSpiderFrequency(), daysSinceWatered); //new SpiderPlant and add fun fact
			
			System.out.println("You'd normally want to water in " + spider.getDaysToWater(SpiderPlant.getDefaultSpiderFrequency(), daysSinceWatered) + " days, but let's check your plant's soil just to make sure.");
			
			System.out.println("Stick your forefinger into the soil up to your first knuckle. Is the soil dry for the first inch - inch 1/2?");
			
			String isItDry = userInput.nextLine(); //check and see if it's dry
				if (isItDry.equals("yes")) {				//if dry, tell user to water and end the program
					spider.checkSoil(true, daysSinceWatered);
					spider.spiderPlantFunFact();
					break;
				}
				else if (isItDry.equals("no")) {
					spider.checkSoil(false, daysSinceWatered); //if not dry, check back when it's time to water
					spider.spiderPlantFunFact();
					break;
					
				}
			
		case 2: //Fiddle leaf
			FiddleLeafPlant fiddle = new FiddleLeafPlant(FiddleLeafPlant.getDefaultFiddleFrequency(), daysSinceWatered);
			
			System.out.println("Is it winter where you are? (December - March)");
			
			String isItWinter = userInput.nextLine();//Adjusting watering time for winter
			
				if (isItWinter.equals("yes")) {
					System.out.println("You'd normally want to water in " + fiddle.getDaysToWater(fiddle.itIsWinter(), daysSinceWatered) + " days, but let's check your plant's soil just to make sure.");
				}
				else if (isItWinter.equals("no")) {
					System.out.println("You'd normally want to water in " + fiddle.getDaysToWater(FiddleLeafPlant.getDefaultFiddleFrequency(), daysSinceWatered) + " days, but let's check your plant's soil just to make sure.");
				}
				
			System.out.println("Stick your forefinger into the soil up to your first knuckle. Is the soil dry for the first inch - inch 1/2?");
			isItDry = userInput.nextLine();
			
				if (isItDry.equals("yes")) {
					fiddle.checkSoil(true, daysSinceWatered);
					fiddle.fiddlePlantFunFact();
					break;
				}
				else if (isItDry.equals("no")) {
					fiddle.checkSoil(false, daysSinceWatered);
					fiddle.fiddlePlantFunFact();
					break;
				}
			
		case 3: 
			PothosPlant pothos = new PothosPlant(PothosPlant.getDefaultpothosfrequency(), daysSinceWatered); //new SpiderPlant and add fun fact
			
			System.out.println("You'd normally want to water in " + pothos.getDaysToWater(pothos.getFrequency(), daysSinceWatered) + " days, but let's check your plant's soil just to make sure.");
			
			System.out.println("Stick your forefinger into the soil up to your first knuckle. Is the soil dry for the first inch - inch 1/2?");
			
			isItDry = userInput.nextLine();
				if (isItDry.equals("yes")) {
					pothos.checkSoil(true, daysSinceWatered);
					pothos.pothosPlantFunFact();
					break;
				}
				else if (isItDry.equals("no")) {
					pothos.checkSoil(false, daysSinceWatered);
					pothos.pothosPlantFunFact();
					break;
					
				}
		case 4: 
			SnakePlant snake = new SnakePlant(SnakePlant.getDefaultsnakefrequency(), daysSinceWatered); //new SpiderPlant and add fun fact
			
			System.out.println("You'd normally want to water in " + snake.getDaysToWater(SnakePlant.getDefaultsnakefrequency(), daysSinceWatered) + " days, but let's check your plant's soil just to make sure.");
			
			System.out.println("Stick your forefinger into the soil up to your first knuckle. Is the soil dry for the first inch - inch 1/2?");
			
			isItDry = userInput.nextLine();
				if (isItDry.equals("yes")) {
					snake.checkSoil(true, daysSinceWatered);
					snake.snakePlantFunFact();
					break;
				}
				else if (isItDry.equals("no")) {
					snake.checkSoil(false, daysSinceWatered);
					snake.snakePlantFunFact();
					break;
				}	
		}
		}
}
