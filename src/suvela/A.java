package suvela;

public class A {
	void m1() {
		B b = new B();
		b.m2();
	}
	public static void main(String[] args) {
		System.out.println("A m1");
		A a = new A();
		a.m1();
	}

}
