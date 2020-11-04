package surbhi;

public class ClassB {

	void m2() {
		System.out.println("m2");
		m3();
	}

	static void m3() {
		System.out.println("m3");
		ClassC c = new ClassC();
		c.m4();
	}
}
