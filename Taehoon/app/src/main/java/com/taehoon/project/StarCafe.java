package com.taehoon.project;

public class StarCafe {
	private String name;
	private int income;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public StarCafe(String name) {
		this.name = name;
	}

	public void sell(int income) {
		this.income += income;
	}
}
