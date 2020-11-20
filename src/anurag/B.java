package anurag;

public class B {

	void m2() {

		B.m3();
		System.out.println("B m2");

	}

	static void m3() {

		C c = new C();
		c.m4();
		System.out.println("B m3");

	}

}
