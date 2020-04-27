package com.seclore.pojo;

public class DispenserType {
	private int numberOfItems, cost;

	public DispenserType() {
		numberOfItems = 50;
		cost = 50;
	}

	public DispenserType(int numberOfItems, int cost) {
		this.numberOfItems = numberOfItems;
		this.cost = cost;
	}

	public int getNoOfItems() {
		return numberOfItems;
	}

	public int getCost() {
		return cost;
	}

	public void makeSale() {
		numberOfItems--;
	}

}
