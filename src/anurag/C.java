package anurag;

public class C {

	void m4() {

		C c = new C();
		c.m5();
		System.out.println("C m4");

	}

	void m5() {

		D.m6();
		System.out.println("C m5");

	}

}
