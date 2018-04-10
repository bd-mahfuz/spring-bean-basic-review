package com.learnSpring.beanInherit;

import java.util.List;

public class Student {

	private String name;
	private int age;
	private Address address;
	private List<Address> listOfAddress;
	
	
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Address> getListOfAddress() {
		return listOfAddress;
	}
	public void setListOfAddress(List<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.println("name="+name+" age="+age);
		for(Address address: listOfAddress) {
			System.out.println(address);
		}
		System.out.println(address);
	}
	
	
}
