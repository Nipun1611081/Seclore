package com.seclore.main;

public class GenericTest<T> {

	T temp;

	public void print(T temp) {
		this.temp = temp;
		System.out.println("Value is :: " + temp);
	}
}
