package com.seclore.main;

import java.util.Scanner;

import com.seclore.pojo.Account;

public class AccountMainV1 {
	public static void main(String[] args) {
		// Object creation
		Account account = new Account();

//		account.accountNumber = 101;
//		account.name = "Vivek Gohil";
//		account.balance = 1000;
//
//		System.out.println("Account Number :: " + account.accountNumber);
//		System.out.println("Name :: " + account.name);
//		System.out.println("Balance :: " + account.balance);

		account.setAccountNumber(101);
		account.setName("Vivek Gohil");
		account.setBalance(1000);

		System.out.println(account.getAccountNumber());
		System.out.println("Name :: " + account.getName());
		System.out.println("Balance :: " + account.getBalance());

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Amount");
		double amount = scanner.nextDouble();

		System.out.println("Calling withdraw :: 400");

		if (account.withdraw(amount)) {
			System.out.println("Transaction Success");
			System.out.println("Balance :: " + account.getBalance());
		} else {
			System.out.println("Transaction Failed");
		}

		System.out.println("Calling deposit :: 400");

		if (account.deposit(amount)) {
			System.out.println("Transaction Success");
			System.out.println("Balance :: " + account.getBalance());
		} else {
			System.out.println("Transaction Failed");
		}

	}
}
