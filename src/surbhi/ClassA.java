package surbhi;

public class ClassA {

	void m1() {
		System.out.println("A,m1");

		ClassB B = new ClassB();
		B.m2();
	}

	public static void main(String[] args) {

		ClassA A = new ClassA();
		A.m1();

	}
}
