package com.taehoon.project.C0313;

public class App {

	static class A {
		public void m1() {
			System.out.println("A.");
		}
	}
	static class B extends A {
		public void m2() {
			System.out.println("B.");
		}
	}
	static class C extends A {
		public void m3() {
			System.out.println("C.");
		}
	}
	static class D extends A {
		public void m4() {
			System.out.println("D.");
		}
	}
	static class E extends B {
		public void m5() {
			System.out.println("E.");
		}
	}
	static class F extends D {
		public void m6() {
			System.out.println("F.");
		}
	}
	static class G extends D {
		public void m7() {
			System.out.println("G.");
		}
	}

	public static void main(String[] args) {
		App a = new App();
	}


}
