package com.seclore.main;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapMain {
	public static void main(String[] args) {
		// Map<Integer, String> empMap = new HashMap<Integer, String>();
		Map<Integer, String> empMap = new TreeMap<Integer, String>();

		empMap.put(101, "A");
		empMap.put(103, "B");
		empMap.put(102, "B");
		empMap.put(12, "C");
		empMap.put(102, "D");

		System.out.println(empMap);

		System.out.println(empMap.get(102));
	}
}
