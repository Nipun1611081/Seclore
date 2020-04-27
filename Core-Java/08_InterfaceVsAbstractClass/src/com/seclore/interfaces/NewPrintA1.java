package com.seclore.interfaces;

public interface NewPrintA1 {
	void printAlsize();

	public default void message() {
		System.out.println("Hello");
	}

}
