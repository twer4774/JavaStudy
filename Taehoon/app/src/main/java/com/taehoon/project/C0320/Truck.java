package com.taehoon.project.C0320;

public class Truck extends Car {


	public Truck(String model) {
		super.model = model;

		super.size = "big";
		this.capacity = 2;
	}


	@Override
	public void start() {
		System.out.println("트럭 시동 거는 소음");
	}

	@Override
	public void run() {
		System.out.println("트럭 달리는 소음");
	}

	public void showInfo() {
		System.out.printf("모델명 : %s 크기 : %s 좌석수 : %d\n", super.model, super.size, this.capacity);
		start();
		run();
	}
}
