package com.seclore.main;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<>();

		numbersList.add(10);
		numbersList.add(3);
		numbersList.add(1);
		numbersList.add(3);
		numbersList.add(2);

		for (Integer i : numbersList) {
			System.out.println(i);
			// numbersList.remove(2);
		}
		System.out.println("--------------------------");
		for (int i = 0; i < numbersList.size(); i++) {
			System.out.println(numbersList.get(i));
			numbersList.remove(Integer.valueOf(1));
			// numbersList.add(1);
		}
		System.out.println("--------------------------");
		for (Iterator iterator = numbersList.iterator(); iterator.hasNext();) {
			System.out.println("in for loop");
			// Integer integer = (Integer)
			// System.out.println(integer);
			iterator.remove();

			// numbersList.remove(Integer.valueOf(10));
			iterator.next();
		}
		System.out.println("-------last-------------------");
		for (Integer i : numbersList) {
			System.out.println(i);
			// numbersList.remove(2);
		}

	}
}
