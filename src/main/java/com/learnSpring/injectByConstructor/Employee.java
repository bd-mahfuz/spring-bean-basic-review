package com.learnSpring.injectByConstructor;

import java.util.Iterator;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private Address address;
	private List<Address> listOfAddress;
	private List<String> stringAddresses;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Employee(int id, String name, List<Address> listOfAddress) {
		this.id = id;
		this.name = name;
		this.listOfAddress = listOfAddress;
	}
	
	public Employee(int id, List<String> stringAddresses, String name) {
		this.id = id;
		this.name = name;
		this.stringAddresses = stringAddresses;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address="+address+"]";
	}
	
	public void showEmWithAddressList() {
		System.out.println("id=" + id + ", name=" + name);
		Iterator<Address> iter = listOfAddress.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public void showEmWithStringList() {
		System.out.println("id=" + id + ", name=" + name);
		Iterator<String> iter = stringAddresses.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
}
