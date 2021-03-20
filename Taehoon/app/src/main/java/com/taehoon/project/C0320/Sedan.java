package com.taehoon.project.C0320;

public class Sedan extends Car {

	int capacity;

	public Sedan(String model) {
		super.model = model;

		super.size = "normal";
		this.capacity = 4;
	}

	@Override
	public void start() {
		System.out.println("세단 시동 거는 소음");
	}

	@Override
	public void run() {
		System.out.println("세단 달리는 소음");
	}

	public void showInfo() {
		System.out.printf("모델명 : %s 크기 : %s 좌석수 : %d\n", super.model, super.size, this.capacity);
		start();
		run();
	}
}
