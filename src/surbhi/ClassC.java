package surbhi;

public class ClassC {

	void m4() {
		System.out.println("m5");
		m5();
	}

	void m5() {
		System.out.println("m6");
		ClassD.m6();
	}

}
