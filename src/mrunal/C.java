package mrunal;

public class C {


	void m4() {
		System.out.println("m5 is called by m4");
		m5();
	}

	void m5() {
		System.out.println("M6 is called by M5");
		D.m6();
	}
}
