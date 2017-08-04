package com.zeewane.object_oriented.liskov_substitution;

/**
 * 抽取出来的顾客的相同特性的父类
 * 
 * @author qizw19186
 *
 */
public class Customer {

	private String name;

	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
