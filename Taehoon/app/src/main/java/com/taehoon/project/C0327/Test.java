package com.taehoon.project.C0327;


interface InterA {
	void method();
}
interface InterB {
	void method();
}
interface InterC {
	default void method() {};
}


class Child implements InterA, InterB, InterC {
	@Override
	public void method() {
		System.out.println("hi!");
	}
}

public class Test {
	public static void main(String[] args) {
		Nor n = new Nor();
		n.m();
	}
}
