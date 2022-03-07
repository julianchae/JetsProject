package com.skilldistillery.jets.entities;

public class CargoJet extends Jets implements loadCargo {

	
	public CargoJet() {
		super();
	}
	public CargoJet(String model, double speed, int range, long price) {
		super(model , speed , range , price);
	}
	@Override
	public String fly() {
		
		return "Model: " + getModel()+" "+"Speed: "+getSpeed()+" "+ "Range: "+getRange()+" " +"Price: "+ getPrice()+" " + 
		"Order recieved, " + getModel() + " in the air." + "\nFuel level: Full. We have enough fuel for: "+
		
				getRange()/getSpeed()+" hours";
	}
	@Override
	public void loadingCargo() {
		System.out.println("Cargo jets loading cargo.");
		
		
	}
	
	
	
	
}
