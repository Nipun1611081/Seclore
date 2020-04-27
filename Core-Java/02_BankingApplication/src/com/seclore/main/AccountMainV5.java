package com.seclore.main;

import com.seclore.pojo.Current;

public class AccountMainV5 {
	public static void main(String[] args) {

		Current current;

		current = new Current(101, "Vivek", 10000, 50000);

		System.out.println("--------------------------------------");

		Current current2 = new Current();
		current2 = current; 
		System.out.println(current2);
		System.out.println("---------------------------------------");

		System.out.println("HashCode of current :: " + current.hashCode());
		System.out.println("HashCode of current2 :: " + current2.hashCode());

		/*
		 * Current current = new Current(101, "Vivek Gohil", 10000, 50000);
		 * System.out.println(current);
		 * 
		 * System.out.println("------------------------------------------------------");
		 * Current current2 = new Current(); System.out.println(current2);
		 * 
		 * System.out.println("------------------------------------------------------");
		 * current2 = current; System.out.println(current2);
		 * System.out.println("------------------------------------------------------");
		 * current2.setName("Mr. India"); System.out.println("Current  :: " + current);
		 * System.out.println("Current2 :: " + current2);
		 */

	}
}
