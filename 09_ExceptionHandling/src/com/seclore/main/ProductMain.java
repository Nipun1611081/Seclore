package com.seclore.main;

import java.util.Scanner;

import com.seclore.exceptions.InvalidProductPriceException;
import com.seclore.pojo.Product;

public class ProductMain {

	static Product product = null;
	static int productId;
	static String name;
	static double price;

	public static Product print() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("in try");
			System.out.println("Enter productid , name,price");
			productId = scanner.nextInt();
			name = scanner.next();
			price = scanner.nextDouble();
			product = new Product(productId, name, price);
		} catch (Exception e) {
			System.out.println("in catch");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("in finally");
			scanner.close();
		}
		return product;

	}

	public static void main(String[] args) {
		System.out.println("Main");
		print();
		System.out.println("back to main");
	}
}
