package rohit.ClassCommunication;

public class B {

	void m2() {
		System.out.println("In non-static method B.m2");
		B.m3();
	}

	static void m3() {
		System.out.println("In static method B.m3");
		C c = new C();
		c.m4();
	}
}
