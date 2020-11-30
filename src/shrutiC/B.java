package shrutiC;

public class B {

	void m2() {
		System.out.println("Class B - method 2");
		m3();
	}

	static void m3() {
		System.out.println("Class B - method 3");
		C c = new C();
		c.m4();
	}

}
