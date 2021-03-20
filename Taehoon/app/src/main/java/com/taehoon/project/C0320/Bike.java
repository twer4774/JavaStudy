package com.taehoon.project.C0320;

public class Bike extends Vehicle {

	public Bike(String model) {
		super.model = model;

		super.size = "small";
	}

	@Override
	public void run() {
		System.out.println("바이크 달리는 소음");
	}

	@Override
	public void start() {
		System.out.println("바이크 시동 거는 소음");
	}

	public void showInfo() {
		System.out.printf("모델명 : %s 크기 : %s\n", super.model, super.size);
		start();
		run();
	}
}
