package com.learnSpring.withoutXml;

import java.beans.ConstructorProperties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name="customer")
	public Customer greetingCustomer() {
		return new CustomerImpl();
	}
	
	@Bean("address")
	Address getAddress() {
		return new Address("Merul", "Dhaka");
	}
	
	@Bean(name ="supplier")
	public Supplier getSupplier() {
		return new Supplier(2, getAddress());
	}
}
