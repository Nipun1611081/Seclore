package com.seclore.main;

import com.seclore.pojo.Current;
import com.seclore.pojo.Savings;

class MyClass {
	int num1 = 10;
	static int num2 = 10;

	public void print() {
		System.out.println("Value of non static variable :: " + num1);
		System.out.println("Value of static variable :: " + num2);
		num1++;
		num2++;
		System.out.println("Value of non static variable :: " + num1);
		System.out.println("Value of static variable :: " + num2);
	}
}

public class AccountMainV6 {
	public static void main(String[] args) {

		Savings savings = new Savings("Test1", 1000, true); // 101
		System.out.println(savings);
		System.out.println("-------------------------------------");

		Current current = new Current("Test2", 10000, 50000); // 102
		System.out.println(current);
	}
}
