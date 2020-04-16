package com.seclore.main;

import com.seclore.pojo.UserDetails;

public class UserDetailsMain {
	public static void main(String[] args) {
		try {
			Class.forName("com.seclore.pojo.UserDetails");

		} catch (ClassNotFoundException e) {
			System.out.println("Invalid Class Name");
		}

		UserDetails details = new UserDetails();
	}
}
