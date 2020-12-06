package rohan.CommunicationBtwnClassed;

public class B {

	void m2() {
		System.out.println("B: m2");
		m3();
	}
		
	static void m3() {
		C c = new C();
		System.out.println("B: m3");
		c.m4();
	}
}
