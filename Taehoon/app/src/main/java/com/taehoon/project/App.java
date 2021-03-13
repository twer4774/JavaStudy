package com.taehoon.project;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person("민수");
		Person p2 = new Person("철수");

		Wallet w = new Wallet(4999);

		if(w.money < 5000) {
			w.setOwner(p1.name);
			p1.getMoney(w.money);
			w.money = 0;
		}
		else if(w.money > 5000) {
			w.setOwner(p2.name);
			p2.getMoney(w.money);
			w.money = 0;
		}
		else {
			w.setOwner("주인");
		}

		System.out.printf("지갑의 Owner는 %s 입니다.\n", w.getOwner());
		System.out.printf("%s 돈 : %d원\n", p1.name , p1.money);
		System.out.printf("%s 돈 : %d원\n", p2.name, p2.money);
		System.out.printf("지갑의 돈 : %d원\n", w.money);

	}
}
