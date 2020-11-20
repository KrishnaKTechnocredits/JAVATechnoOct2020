package suresh;

public class B {
	void m2() {
		System.out.println(" Calling Class B - Method 3");
		B.m3();
	}
	static void m3() {
		System.out.println(" Static Method Calling Class C - Method 4");
		C c = new C();
		c.m4();
	}

}
