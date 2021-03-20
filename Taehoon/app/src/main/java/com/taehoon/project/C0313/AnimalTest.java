package com.taehoon.project.C0313;

class Animal {
	public void move(){
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 걸어갑니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move(){
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal{
	@Override
	public void move(){
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		AnimalTest aTest = new AnimalTest();

		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}

	//어떤 매개변수가 전달되느냐에 따라 출력문이 달라진다
	private void moveAnimal(Animal animal) {
		animal.move();
	}
}