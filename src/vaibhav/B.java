package vaibhav;

public class B {
	
	void m2() {
		System.out.println("In Class B:: M2 Metod");
		B.m3();
	}
	
	static void m3() {
		System.out.println("In Class B:: M3 Metod");
		C c = new C();
		c.m4();		
	}

}
