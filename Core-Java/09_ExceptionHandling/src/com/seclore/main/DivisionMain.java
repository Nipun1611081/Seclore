package com.seclore.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.seclore.util.DivisionUtility;

public class DivisionMain {

	public static void main(String[] args) {
		int number1, number2;
		double result = 0;

		Scanner scanner = new Scanner(System.in);
		DivisionUtility divisionUtility = new DivisionUtility();

		try {
			System.out.println("Enter Number1");
			number1 = scanner.nextInt();
			System.out.println("Enter Number2");
			number2 = scanner.nextInt();
			result = divisionUtility.divide(number1, number2);
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception :: Invalid Input");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException :: Invalid Input");
		} catch (Exception e) {
			System.out.println("Exception ");
		} finally {
			try {
				System.out.println("Exception !!");
			} catch (Exception e) {
				// TODO: h
			}
		}

		System.out.println("Result is " + result);

		scanner.close();

	}
}
