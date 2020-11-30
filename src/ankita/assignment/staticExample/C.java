package ankita.assignment.staticExample;

public class C {
	void m4() {
		System.out.println("Class C->M4   :Call from non-static to non-static :M4 -> M5 ");
		C c = new C();
		c.m5();
	}
	void m5() {
		System.out.println("Class C->M5   :Call from non-static to static :M5 -> M6 ");
		D.m6();
	}
}
