package com.seclore.main;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetMain {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("Vivek");
		nameSet.add("Calden");
		nameSet.add("Pratik");
		nameSet.add("Ayush");
		nameSet.add("Calden");

		System.out.println(nameSet);

		SortedSet<String> sortedNameSet = new TreeSet<String>();
		sortedNameSet.add("Vivek");
		sortedNameSet.add("Calden");
		sortedNameSet.add("Pratik");
		sortedNameSet.add("Ayush");

		System.out.println("SortedNameSet :: " + sortedNameSet);
	}
}
