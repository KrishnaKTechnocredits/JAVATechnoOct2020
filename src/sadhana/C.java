package sadhana;

public class C {
	public void m4() {
		System.out.println("m4 method of C");
		C c=new C();
		c.m5();
	}

	void m5() {
		System.out.println("m5 method of C");
		D.m6();
	}
}
