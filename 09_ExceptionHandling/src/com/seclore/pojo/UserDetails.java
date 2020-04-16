package com.seclore.pojo;

public class UserDetails {

	private static int userId = 10;

	static {
		System.out.println("Static Block start");
		System.out.println("userID :: " + userId);
		System.out.println("Static Block end");
	}

	public UserDetails() {
		System.out.println("Default Constructor");
	}
}
