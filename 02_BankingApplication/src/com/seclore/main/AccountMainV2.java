package com.seclore.main;

import java.util.Scanner;

import com.seclore.pojo.Account;

public class AccountMainV2 {

	public static void main(String[] args) {

		long accountNumber;
		String name;
		double balance;
		int transactionChoice;
		String continueChoice;
		int amount;

		Scanner scanner = new Scanner(System.in);
		Account account = new Account();

		System.out.println("Welcome to ABCD Bank");

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();

		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("Thanks for the details");
		System.out.println("Account Number :: " + account.getAccountNumber());
		System.out.println("Name :: " + account.getName());
		System.out.println("Balance :: " + account.getBalance());

		do {
			System.out.println("Menu");
			System.out.println("1.. Withdraw");
			System.out.println("2.. Deposit");
			System.out.println("3.. Balance");

			System.out.println("Enter your choice");
			transactionChoice = scanner.nextInt();

			switch (transactionChoice) {
			case 1:
				System.out.println("Enter amount to be withdraw");
				amount = scanner.nextInt();
				if (account.withdraw(amount))
					System.out.println("Transaction Success");
				else
					System.out.println("Transaction Failed");
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextInt();
				if (account.deposit(amount))
					System.out.println("Transaction Success");
				else
					System.out.println("Transaction Failed");
				break;

			case 3:
				System.out.println("Balance is :: " + account.getBalance());
				break;
			default:
				System.out.println("Sorry , invalid option");
				break;
			}

			System.out.println("Do you want to continue ?");
			continueChoice = scanner.next();
		} while (continueChoice.equalsIgnoreCase("yes"));

		scanner.close();
	}
}
