package com.seclore.main;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMain {
	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<>();

		numbersList.add(10);
		numbersList.add(3);
		numbersList.add(1);
		numbersList.add(3);
		numbersList.add(2);

		ListIterator<Integer> iterator = numbersList.listIterator(numbersList.size());

		while (iterator.hasPrevious()) {
			// iterator.add(Integer.valueOf(1000));
			Integer integer = (Integer) iterator.previous();
			System.out.println(integer);
		}

		System.out.println("-----------------------------------`");

		for (Integer integer : numbersList) {
			System.out.println(integer);
		}
	}
}
