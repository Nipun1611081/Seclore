package com.seclore.pojo;

import com.seclore.interfaces.NewPrintA1;
import com.seclore.interfaces.PrintA1;

public class Canon6541A extends Printer implements PrintA1, NewPrintA1 {
	@Override
	public void print() {
		System.out.println("Canon6541A is printing...");
	}

	@Override
	public void printAlsize() {
		System.out.println("Canon6542A is printint A1 size paper");
	}

	@Override
	public void message() {
		NewPrintA1.super.message();
		PrintA1.super.message();
	}

}
