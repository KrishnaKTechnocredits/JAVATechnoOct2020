package sadhana;

public class B {
	public void m2() {
		System.out.println("m2 method of B");
		m3();
	}

	static void m3() {
		System.out.println("m3 method of B");
		C c = new C();
		c.m4();

	}
}
