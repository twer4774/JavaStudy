package com.taehoon.project;

public class Company {
	public static int cardNumber = 100;
	public String name;
	public int soldCardCount;

	public static void some() {
		cardNumber = 200;
		name = "asdf";
	}
	public void some2() {
		cardNumber = 200;
	}

	public Company(String name) {
		this.name = name;
	}

	public void issueCard() {
		cardNumber++;
		soldCardCount++;
	}
}
