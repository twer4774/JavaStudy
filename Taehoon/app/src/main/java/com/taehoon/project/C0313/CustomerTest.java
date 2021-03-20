package com.taehoon.project.C0313;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerArrayList = new ArrayList<>();

		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율곡");

		Customer customerKim = new VIPCustomer(10050, "김유신", 1234);


		VIPCustomer a = new VIPCustomer(1010, "하나", 1);


		customerArrayList.add(customerLee);
		customerArrayList.add(customerShin);
		customerArrayList.add(customerHong);
		customerArrayList.add(customerYoul);
		customerArrayList.add(customerKim);

		System.out.println("========= 고객 정보 출력 ==========");
		for (Customer customer : customerArrayList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println("========== 할인율과 보너스 포인트 계산 ==========");
		int price = 10000;
		for (Customer customer : customerArrayList) {
			int cost = customer.calcPrice(price);

			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
	}

}