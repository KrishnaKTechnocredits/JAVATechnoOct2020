package ankit.inBetweenMethodsCall;

public class B {
	
	void m2() {
		System.out.println("Calling static method M3");
		B.m3();
	}
	
	static void m3() {
		System.out.println("Calling method M4");
		 C c = new C();
		 c.m4();
	}
}
