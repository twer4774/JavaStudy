package com.taehoon.project;

public class Buyer {
	String name;
	int age;
	static int serialNumber;

	public Buyer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void sellCard(int cardNumber) {
		serialNumber = cardNumber;
	}

}
