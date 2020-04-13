package com.seclore.main;

import com.seclore.pojo.Account;
import com.seclore.pojo.Savings;

public class AccountMainV4 {
	public static void main(String[] args) {

		Savings savings = new Savings(101, "Vivek Gohil", 1000, true);

		System.out.println(savings);

		System.out.println("-------------------------------------------------------");
		Account account = new Account(102, "Raja Hindustani", 1000);

		System.out.println(account);
	}
}
