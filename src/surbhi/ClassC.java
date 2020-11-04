package surbhi;

public class ClassC {
	void m4() {
		System.out.println("m4");
		m5();
	}

	void m5() {
		System.out.println("m5");
		ClassD.m6();
	}

}
