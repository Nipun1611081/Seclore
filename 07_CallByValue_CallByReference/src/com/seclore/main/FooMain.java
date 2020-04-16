package com.seclore.main;

import com.seclore.examples.Foo;

public class FooMain {
	public static void main(String[] args) {
		int x = 10;

		Foo foo = new Foo();

		foo.print(x);
		System.out.println("-----------------------");
		System.out.println("Value of x in main :: " + x);
		foo.printAgain();

	}
}
