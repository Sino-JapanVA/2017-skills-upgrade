package com.zeewane.object_oriented.liskov_substitution;

public class NormalCustomer extends Customer{
	
	public NormalCustomer(String name,String email) {
		super.setName(name);
		super.setEmail(email);
	}

}
