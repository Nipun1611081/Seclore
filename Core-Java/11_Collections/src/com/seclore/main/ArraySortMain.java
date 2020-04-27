package com.seclore.main;

import java.util.Arrays;

public class ArraySortMain {
	public static void main(String[] args) {
		String[] laptops = new String[] { "Dell", "Apple", "HP", "Lenovo", "ASUS", "Vaio", "MSI" };

		Arrays.sort(laptops);

		for (String laptop : laptops) {
			System.out.println(laptop);
		}
	}
}
