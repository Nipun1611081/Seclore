package com.seclore.pojo;

public class Current extends Account {
	private double overdraftLimit;
	private double initialOverdraftLimit;

	public Current() {
		System.out.println("Default Constructor of Current Account");
	}

	public Current(long accountNumber, String name, double balance, double overdraftLimit) {
		super(accountNumber, name, balance);
		this.overdraftLimit = overdraftLimit;
		this.initialOverdraftLimit = overdraftLimit;
		System.out.println("Param. constructor of Current Account");
	}

	public Current(String name, double balance, double overdraftLimit) {
		super(name, balance);
		this.overdraftLimit = overdraftLimit;
		this.initialOverdraftLimit = overdraftLimit;
		System.out.println("Param. constructor of Current Account");
	}

	@Override
	public boolean withdraw(double amount) {

		return false;
	}

	@Override
	public boolean deposit(double amount) {

		return false;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String toString() {
		return "Current [overdraftLimit=" + overdraftLimit + ", getAccountNumber()=" + getAccountNumber()
				+ ", getName()=" + getName() + ", getBalance()=" + getBalance() + "]";
	}

}
