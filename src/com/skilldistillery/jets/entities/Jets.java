package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jets {
	
	private String model = "";
	private double speed = 0.0;
	private int range = 0;
	private long price = 0;
	
	public Jets() {
		
	}
	
	public Jets(String model, double speed, int range, long price) {
		
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		
	}
	public abstract String fly();
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setCost(long price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, model, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jets other = (Jets) obj;
		return price == other.price && Objects.equals(model, other.model) && range == other.range
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	@Override
	public String toString() {
		return "Model: " + model + " Speed: " + speed + " Range: " + range + " Price: " + price;
	}
	
	
}
