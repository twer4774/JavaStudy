package com.taehoon.project;

public class Guest {
	String name;
	int money;

	public Guest(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void buyAmericano(StarCafe starCafe) {
		starCafe.sell(4000);
		this.money -= 4000;
	}

	public void buyLatte(CongCafe congCafe) {
		congCafe.sell(4500);
		this.money -= 4500;
	}

}
