package kajolMultipleClassesCommunication;

public class B {
		
	void m2() {
		System.out.println("Class B: Method m2 is Non Static Method.");
		System.out.println("Method m2 of Class B is calling Static Method m3 of same Class B,hence object Creation is not necessary.");
		System.out.println();
		B.m3();
		
	}
	
	static void m3() {
		System.out.println("Class B: Method m3 is Static Method.");
		System.out.println("Method m3 of Class B is calling  Non Static Method m4 of Class C,hence object Creation is must.");
		System.out.println();
		new C().m4();
	}
}
