package himali;

public class B {
	void m2() {
		System.out.println("B m2");
		B.m3();
	}
	static void m3() {
		System.out.println("B m3");
		C c=new C();
		c.m4();
	}

}
