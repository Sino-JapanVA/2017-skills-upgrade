package com.zeewane.object_oriented.liskov_substitution;

public class VIPCustomer extends Customer {
	
	public VIPCustomer(String name, String email) {
		super.setName(name);
		super.setEmail(email);
	}
}
