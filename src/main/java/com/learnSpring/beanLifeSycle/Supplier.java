package com.learnSpring.beanLifeSycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Supplier implements InitializingBean, DisposableBean{

	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void beforeInit() {
		System.out.println("calling befor initialization");
	}
	
	public void beforeDestroy() {
		System.out.println("calling befor Destroy");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("before initializing bean");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("before destroying bean");
		
	}
	
	
}
