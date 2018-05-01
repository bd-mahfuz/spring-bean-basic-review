package com.learnSpring.stereotype;

public class Charger {

	private String chargerName;
	private String model;
	
	public String getChargerName() {
		return chargerName;
	}
	public void setChargerName(String chargerName) {
		this.chargerName = chargerName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Charger [chargerName=" + chargerName + ", model=" + model + "]";
	}
	
	
}
