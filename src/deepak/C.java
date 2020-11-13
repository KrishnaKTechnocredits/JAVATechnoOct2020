package deepak;

public class C {
	void m4() {
		System.out.println("C : m4()");
		C c = new C();
		c.m5();	
	}
	void m5() {
		System.out.println("C : m5()");
		D.m6();	
	}
}
