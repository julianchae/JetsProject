package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	public AirField() {

		takeList();

	}

	List<Jets> listOfJets = new ArrayList<>(); // Creating an array list of the object Jets.

	public void takeList() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {

			String line;

			while ((line = bufIn.readLine()) != null) {

				String[] jetSpecs = line.split(",");

				if (line.toLowerCase().contains("fighter")) {

					String model = jetSpecs[1];

					double speed = Double.parseDouble(jetSpecs[2]);

					int range = Integer.parseInt(jetSpecs[3]);

					long price = Long.parseLong(jetSpecs[4]);

					FighterJet fighter = new FighterJet(model, speed, range, price);

					listOfJets.add(fighter);
					

				} 
				if(line.toLowerCase().contains("cat")) {
					String model = jetSpecs[1];

					double speed = Double.parseDouble(jetSpecs[2]);

					int range = Integer.parseInt(jetSpecs[3]);

					Long price = Long.parseLong(jetSpecs[4]);

					Frank frank = new Frank(model, speed, range, price);

					listOfJets.add(frank);
					
					
					
				}
				else if (line.toLowerCase().contains("cargo")) {

					String model = jetSpecs[1];

					double speed = Double.parseDouble(jetSpecs[2]);

					int range = Integer.parseInt(jetSpecs[3]);

					Long price = Long.parseLong(jetSpecs[4]);

					CargoJet cargo = new CargoJet(model, speed, range, price);

					listOfJets.add(cargo);
				}

			}
		} catch (IOException e) {

			System.err.println(e);
		}

	}

	public void printListOfJets() {
		
		for (Jets jet : listOfJets) {
			
			System.out.println(jet);

		}

	}

	public void fly() {
		System.out.println("Flying Jets.");

		for (Jets jet : listOfJets) {

			System.out.println(jet.fly());
		}
	}

	public void fastest() {

		Jets max = listOfJets.get(0);
		for (Jets jet : listOfJets) {

			if (jet.getSpeed() > max.getSpeed()) {

				max = jet;
			}

		}
		System.out.println("The jet with the fastest speed is : " + max);
	}

	public void longestRange() {
		Jets maxRange = listOfJets.get(0);
		for (Jets jet : listOfJets) {

			if (jet.getRange() > maxRange.getRange()) {
				maxRange = jet;

			}

		}
		System.out.println("The jet with the longest range is : " + maxRange);

	}

	public void loadCargo() {
		CargoJet cargoJet = new CargoJet();
		// for(Jets jet : listOfJets) {
//			
//			if(jet instanceof CargoJet ) {
//				((CargoJet) jet).loadingCargo();
		cargoJet.loadingCargo();

	}

	public void fight() {
		FighterJet fighterJet = new FighterJet();
		// for(Jets jet : listOfJets) {
//			
//			if(jet instanceof FighterJet) {
//				((FighterJet) jet).dogFight();
//			}
		fighterJet.dogFight();
	}

	public void addJet() {
		Scanner kb = new Scanner(System.in);
		System.out.println("You have chosen to add a jet to our hanger. Please follow the directions explicity");
		System.out.println("What is the model of your jet in one word?");
		String model = kb.next();
		System.out.println("What is the speed of your jet?");
		double speed = kb.nextDouble();
		System.out.println("What is the range of your jet?");
		int range = kb.nextInt();
		System.out.println("What is the cost of your jet?");
		long cost = kb.nextLong();

		JetImp addJet = new JetImp(model, speed, range, cost);

		listOfJets.add(addJet);

		System.out.println("You have added : " + addJet.toString());

	}

		public void removeJet() {
			Scanner kb = new Scanner(System.in);
	        System.out.println("Which Jet would you like to remove?");
	        printListOfJets();
	        System.out.print("Please choose from 1 to " + listOfJets.size() + ": ");
	        int remove = kb.nextInt();
	        listOfJets.remove(remove - 1);
	        System.out.println(remove + " removed.");
	        System.out.println();

	    }
	}


