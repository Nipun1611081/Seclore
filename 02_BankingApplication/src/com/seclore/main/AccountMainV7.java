package com.seclore.main;

import java.util.Scanner;

import com.seclore.pojo.Current;
import com.seclore.pojo.Savings;

public class AccountMainV7 {
	static double balance;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Savings savings;
		Current current;

		double amount, overdraftLimit;
		String name, continueChoice;
		int accountChoice, transactionChoice;
		boolean isSalary;

		System.out.println("Welcome to XYZ bank");
		System.out.println("Menu");
		System.out.println("1..Savings Account");
		System.out.println("2..Current Account");
		accountChoice = scanner.nextInt();
		scanner.nextLine();
		switch (accountChoice) {
		case 1:
			System.out.println("Enter details for savings account");
			System.out.println("Enter name");
			name = scanner.nextLine();

			System.out.println("Do you want to open salary account");
			isSalary = scanner.nextBoolean();
			while (balanceValidation(isSalary, scanner)) {
				System.out.println("Invalid Balance");
			}
			savings = new Savings(name, balance, isSalary);
			System.out.println("Account opened successfully ");
			System.out.println(savings);
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
					if (savings.withdraw(amount))
						System.out.println("Transaction Success");
					else
						System.out.println("Transaction Failed");
					break;
				case 2:
					System.out.println("Enter amount to deposit");
					amount = scanner.nextInt();
					if (savings.deposit(amount))
						System.out.println("Transaction Success");
					else
						System.out.println("Transaction Failed");
					break;

				case 3:
					System.out.println("Balance is :: " + savings.getBalance());
					break;
				default:
					System.out.println("Sorry , invalid option");
					break;
				}

				System.out.println("Do you want to continue ?");
				continueChoice = scanner.next();
			} while (continueChoice.equalsIgnoreCase("yes"));
			break;
		case 2:
			System.out.println("Enter details for current account");
			System.out.println("Enter name");
			name = scanner.nextLine();
			System.out.println("Enter Balance");
			balance = scanner.nextDouble();
			System.out.println("Enter overdraftLimit");
			overdraftLimit = scanner.nextDouble();
			current = new Current(name, balance, overdraftLimit);
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
					if (current.withdraw(amount))
						System.out.println("Transaction Success");
					else
						System.out.println("Transaction Failed");
					break;
				case 2:
					System.out.println("Enter amount to deposit");
					amount = scanner.nextInt();
					if (current.deposit(amount))
						System.out.println("Transaction Success");
					else
						System.out.println("Transaction Failed");
					break;

				case 3:
					System.out.println("Balance is :: " + current.getBalance());
					break;
				default:
					System.out.println("Sorry , invalid option");
					break;
				}

				System.out.println("Do you want to continue ?");
				continueChoice = scanner.next();
			} while (continueChoice.equalsIgnoreCase("yes"));
			break;

		default:
			System.out.println("Invalid Option ");
			break;
		}
	}

	static boolean balanceValidation(boolean isSalary, Scanner scanner) {
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		if (!isSalary && balance < 1500) {
			return true;
		}
		return false;
	}
}
