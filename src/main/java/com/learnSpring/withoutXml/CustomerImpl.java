package com.learnSpring.withoutXml;

public class CustomerImpl implements Customer {

	@Override
	public void welcomeMessage(String welcomeMessage) {
		System.out.println("Hello Customer ! You are welcome");
	}

	
}
