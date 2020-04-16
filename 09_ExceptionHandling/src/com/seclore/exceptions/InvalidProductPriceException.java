package com.seclore.exceptions;

public class InvalidProductPriceException extends Exception {
	public InvalidProductPriceException() {
		System.out.println("InvalidProductPriceException");
	}

	@Override
	public String getMessage() {
		return "Invalid Price. Please enter price > 0";
	}
}
