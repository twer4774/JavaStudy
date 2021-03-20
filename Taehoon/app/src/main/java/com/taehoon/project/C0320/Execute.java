package com.taehoon.project.C0320;

public class Execute {
	public static void main(String[] args) {
		Bike b = new Bike("MZ1");
		Truck t = new Truck("Fea");
		Sedan s = new Sedan("Sonata");



		b.showInfo();
		System.out.println("============================");
		t.showInfo();
		System.out.println("============================");
		s.showInfo();
	}
}
