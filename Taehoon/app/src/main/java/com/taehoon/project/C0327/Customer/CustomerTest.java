package com.taehoon.project.C0327.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();

		Buy buyer = customer;

		Sell seller = customer;
		seller.sell();

		// Customer는 seller의 하위 클래스이기에 통과
		if(seller instanceof Customer) {

			// 상위 클래스인 Sell의 seller를 하위 클래스인 Customer의 customer2로 다운 캐스팅
			Customer customer2 = (Customer)seller;

			customer2.buy();
			customer2.sell();
		}
	}
}
