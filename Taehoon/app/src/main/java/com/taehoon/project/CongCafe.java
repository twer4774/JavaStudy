package com.taehoon.project;

public class CongCafe {
	String name;
	int income;

	public CongCafe(String name) {
		this.name = name;
	}

	public void sell(int income) {
		this.income += income;
	}

}
