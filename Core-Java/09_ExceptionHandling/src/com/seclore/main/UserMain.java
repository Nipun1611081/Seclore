package com.seclore.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int age = 0;

		try {
			System.out.println("Enter Age of user");
			age = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input");
			System.out.println(e.getMessage());

		}

		System.out.println("Age :: " + age);

	}
}
