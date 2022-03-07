package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		JetsApplication jetApp = new JetsApplication();

		jetApp.go();

	}

	public void go() {

		menu();

	}

	private void menu() {
		AirField airField = new AirField();

		boolean menu = true;

		while (menu) {

			System.out.println("1. List fleet ");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest Jet");
			System.out.println("4. View jet with longest range ");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Remove a Jet from the Fleet ");
			System.out.println("9. Quit");

			int userSelection = kb.nextInt();

			switch (userSelection) {
			case 1:
				airField.printListOfJets();

				break;

			case 2:

				airField.fly();

				break;

			case 3:

				airField.fastest();

				break;

			case 4:

				airField.longestRange();
				break;

			case 5:

				airField.loadCargo();

				break;

			case 6:
				airField.fight();

				break;

			case 7:

				airField.addJet();

				break;
			case 8:

				airField.removeJet();

				break;

			case 9:

				System.out.println("Thank you, good bye.");

				menu = false;
				break;

			default:
				System.out.println("Please enter a number from 1-9.");
				break;
			}
		}

	}
}
