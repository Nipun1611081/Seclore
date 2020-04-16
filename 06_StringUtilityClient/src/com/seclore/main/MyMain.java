package com.seclore.main;

import com.seclore.util.AllCapsUtility;
import com.seclore.util.AllSmallCapsUtility;

public class MyMain {
	public static void main(String[] args) {

		String text = "hello world";
		System.out.println("All Caps :: " + AllCapsUtility.convertToAllCaps(text));
		text = "Hello World";
		System.out.println("Small Caps :: " + AllSmallCapsUtility.convertToSmallCaps(text));

	}
}
