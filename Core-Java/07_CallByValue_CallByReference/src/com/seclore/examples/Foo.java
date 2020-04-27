package com.seclore.examples;

//call by value example
public class Foo {
	int x;

	public void print(int x) {
		x++;
		System.out.println("x :: " + x);
		this.x = x;
		
		System.out.println(x);
	}

	public void printAgain() {
		System.out.println("x :: " + this.x);
	}
}
