package com.seclore.pojo;

public class CashRegister {
	private int cashOnHand;

	public CashRegister() {
		cashOnHand = 500;
	}

	public CashRegister(int cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public int getCashOnHand() {
		return cashOnHand;
	}

	public int getCurrentBalance() {
		return cashOnHand;
	}

	public void acceptAmount(int amount) {
		cashOnHand += amount;
	}

}
