package deepak;

public class B {
	void m2() {
		System.out.println("B : m2()");
		m3();
	}
	static void m3() {
		System.out.println("B : m3() : Static");
		C c = new C();
		c.m4();
	}
}
