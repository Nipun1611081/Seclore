package com.seclore.main;

import com.seclore.pojo.CashRegister;
import com.seclore.pojo.DispenserType;
import java.util.Scanner;

public class MainCandy {
	public static void main(String[] args) {
		System.out.println("welcome to the candy store");
		System.out.println("select any one from the menu");
		System.out.println("1. Candies \n2. chips \n3. gum \n4. cookies ");
		int menuChoice, money, continueFurther;
		Scanner sc = new Scanner(System.in);
		menuChoice = sc.nextInt();

		CashRegister cashregister = new CashRegister();
		DispenserType candies = new DispenserType();
		DispenserType chips = new DispenserType();
		DispenserType gum = new DispenserType();
		DispenserType cookies = new DispenserType();
		do {
			switch (menuChoice) {
			case 1:
				if (candies.getNoOfItems() > 0) {
					System.out.println("you have selected candy");
					System.out.println("cost of candy is " + candies.getCost());
					System.out.println("enter money into the system");
					money = sc.nextInt();
					if (money >= candies.getCost()) {
						cashregister.acceptAmount(money - candies.getCost());
						candies.makeSale();
						System.out.println("here is your candy and change=  Rs." + (money - candies.getCost()));
					} else {
						System.out.println("please enter sufficient amount of money");
					}
				} else
					System.out.println("no candies available");

				break;
			case 2:
				if (chips.getNoOfItems() > 0) {
					System.out.println("you have selected chips");
					System.out.println("cost of chips is " + chips.getCost());
					System.out.println("enter money into the system");
					money = sc.nextInt();
					if (money >= chips.getCost()) {
						cashregister.acceptAmount(money);
						chips.makeSale();
						System.out.println("here is your chips and change=  Rs." + (money - chips.getCost()));
					} else {
						System.out.println("please enter sufficient amount of money");
					}
				} else
					System.out.println("no chips available");
				break;
			case 3:
				if (gum.getNoOfItems() > 0) {
					System.out.println("you have selected gum");
					System.out.println("cost of candy is " + gum.getCost());
					System.out.println("enter money into the system");
					money = sc.nextInt();
					if (money >= gum.getCost()) {
						cashregister.acceptAmount(money);
						gum.makeSale();
						System.out.println("here is your candy and change=  Rs." + (money - gum.getCost()));
					} else {
						System.out.println("please enter sufficient amount of money");
					}
				} else
					System.out.println("no gum available");
				break;

			case 4:
				if (cookies.getNoOfItems() > 0) {
					System.out.println("you have selected cookies");
					System.out.println("cost of cookies is " + cookies.getCost());
					System.out.println("enter money into the system");
					money = sc.nextInt();
					if (money >= cookies.getCost()) {
						cashregister.acceptAmount(money);
						cookies.makeSale();
						System.out.println("here is your candy and change=  Rs." + (money - cookies.getCost()));
					} else {
						System.out.println("please enter sufficient amount of money");
					}
				} else
					System.out.println("no cookies available");
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + menuChoice);
			}
			System.out.println("want to have more candies press 1 to continue 0 to exit ");
			continueFurther = sc.nextInt();
		} while (continueFurther == 1);
		System.out.println("Thank you !!");
		System.out.println("Cash Register :: " + cashregister.getCashOnHand());
	}
}
