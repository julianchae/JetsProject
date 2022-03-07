package com.skilldistillery.jets.entities;

public class JetImp extends Jets {

	public JetImp() {
		super();
	}
	
	public JetImp(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}
	public String fly() {
		return "Model: " + getModel()+" "+"Speed: "+getSpeed()+" "+ "Range: "+getRange()+" " +"Price: "+ getPrice()+" " + 
				"Order recieved, " + getModel() + " in the air." + "\nFuel level: Full. We have enough fuel for: "+
		
				getRange()/getSpeed()+" hours";
		
	}

	@Override
	public String toString() {
		return "Model: "+ getModel()+ " Speed: "+getSpeed()+ " Range; " +getRange()+ " Price: "+ getPrice();
		
		
	}
	}


