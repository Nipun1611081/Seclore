package com.seclore.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionSortMain {
	public static void main(String[] args) {
		List<String> laptopsList = new ArrayList<>();

		laptopsList.add("HP");
		laptopsList.add("Apple");
		laptopsList.add("Dell");
		laptopsList.add("Lenovo");
		laptopsList.add("MSI");
		laptopsList.add("Vaio");

		for (int i = 0; i < laptopsList.size(); i++) {
			System.out.println(laptopsList.get(i));
			if (laptopsList.get(i).equals("Dell")) {
				laptopsList.remove(i);
			}
		}

		System.out.println("----------------------------------");

		Iterator<String> iteratorString = laptopsList.iterator();

		while (iteratorString.hasNext()) {
			String temp = (String) iteratorString.next();

		}
	}
}
