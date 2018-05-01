package com.learnSpring.withoutXml;

public class Supplier {

	private int id;
	private Address address;

	public Supplier(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Supplier [id=" + id + " address="+address+"]";
	}
	
	
	
	
}
