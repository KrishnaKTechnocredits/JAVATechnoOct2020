package ankita.staticExample;

public class B {
	
	void m2() {
		System.out.println("Class B->M2   :Call from non-static to Static :M2 -> M3 ");
		B.m3();
	}
	static void m3() {
		System.out.println("Class B->M3   :Call from static to non-static :M3 -> M4 ");
		C c =new C();
		c.m4();
	}
}
