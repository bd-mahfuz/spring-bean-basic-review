package com.learnSpring.autowiring;

public class Mobile {

	private String name;
	private String model;
	private Charger charger;
	private Charger charger2;
	
	public Mobile() {
		
	}
	
	public Mobile(String name, String model, Charger charger) {
		this.name = name;
		this.model = model;
		this.charger = charger;
	}
	
	public Charger getCharger2() {
		return charger2;
	}
	public void setCharger2(Charger charger2) {
		this.charger2 = charger2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	public void show() {
		System.out.println("name="+name+ " model="+model);
		System.out.println(charger);
		System.out.println(charger2);
	}
	
	
	
}
