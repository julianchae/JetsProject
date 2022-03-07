package com.skilldistillery.jets.entities;

public class Frank extends Jets implements fight{

	public Frank(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void dogFight() {
	
		
	}

	@Override
	public String fly() {

		return "Model: " + getModel()+" "+"Speed: "+getSpeed()+" "+ "Range: "+getRange()+" " +"Price: "+ getPrice()+" " + 
				"Order recieved, " + getModel() + " in the air." + "\nFood level: Full. We have enough energy for: "+
		
				getRange()/getSpeed()+" hours";
	}

}
