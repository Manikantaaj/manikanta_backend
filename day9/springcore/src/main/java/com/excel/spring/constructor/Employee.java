package com.excel.spring.constructor;

import java.net.Inet4Address;

public class Employee {

	private int id;
	private String name;
	private Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	public Employee() {
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
