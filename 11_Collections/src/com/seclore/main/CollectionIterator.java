package com.seclore.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionIterator {
	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<>();

		numbersList.add(10);
		numbersList.add(3);
		numbersList.add(1);
		numbersList.add(3);
		numbersList.add(2);

//		for (int i = 0; i < numbersList.size(); i++) {
//			System.out.println(numbersList.get(i));
//			numbersList.remove(Integer.valueOf(3));
//		}
//		// 1.5
//		for (Integer temp : numbersList) {
//			System.out.println(temp);
//			// numbersList.add(Integer.valueOf(55));
//			// numbersList.remove(Integer.valueOf(3));
//			// numbersList.remove(1);
//		}

		System.out.println("-----------------Iterator-----------------------------");
		// Iterator<Integer> numberIterator = numbersList.iterator();
		ListIterator<Integer> listIterator = numbersList.listIterator(numbersList.size());

		while (listIterator.hasNext()) {
			Integer temp = (Integer) listIterator.next();
			listIterator.add(4);
		}
		System.out.println("After loop");
//
		while (listIterator.hasPrevious()) {
			Integer temp = (Integer) listIterator.previous();
			System.out.println(temp);
			if (temp)
				listIterator.add(10);
		}

//		while (numberIterator.hasNext()) {
//			Integer temp = (Integer) numberIterator.next();
//			System.out.println(temp);
//			if (temp == 3)
//				numberIterator.remove();
//		}

//		for (Iterator iterator = numbersList.iterator(); iterator.hasNext();) {
//			Integer temp = (Integer) iterator.next();
//			System.out.println(temp);
//
//		}
//
//		System.out.println("--------------------------------------------------");
//		for (Integer integer : numbersList) {
//			System.out.println(integer);
//		}
	}

}
