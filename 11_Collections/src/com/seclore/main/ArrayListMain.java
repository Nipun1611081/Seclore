package com.seclore.main;

import java.util.ArrayList;

public class ArrayListMain {
	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<>();

		int x = 10;
		numbersList.add(0);
		numbersList.add(3);
		numbersList.add(1);
		numbersList.add(3);
		numbersList.add(2);

		System.out.println("NumbersList :: " + numbersList);
		System.out.println("size :: " + numbersList.size());
		numbersList.remove(Integer.valueOf(3));
		System.out.println("NumbersList :: " + numbersList);

		ArrayList<String> nameList = new ArrayList<>();

		nameList.add("Abhishek");
		nameList.add("Vishal");
		nameList.add("Abhishek");

		System.out.println("NameList :: " + nameList);
		System.out.println("Size :: " + nameList.size());

		nameList.remove("Vishal");
		System.out.println("NameList :: " + nameList);

	}
}
