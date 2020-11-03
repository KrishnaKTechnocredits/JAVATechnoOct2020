package nagendra;

public class C {

	void m4() {

		System.out.println("Class C  M4 Method");
		C c =new C();
		c.m5();
	}

	void m5() {

		System.out.println("Class C  M5 Method");
		D.m6();
	}
}
