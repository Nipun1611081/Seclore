package com.seclore.interfaces;

public interface PrintA1 {
	void printAlsize();

	public default void message() {
		System.out.println("Hi");
	}
}
