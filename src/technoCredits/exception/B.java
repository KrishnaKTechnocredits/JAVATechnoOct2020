package technoCredits.exception;

import java.io.FileNotFoundException;

public class B {
	
	void m2() throws FileNotFoundException {
		System.out.println("B m2 Start");
		C c1 = new C();
		c1.m3();
		System.out.println("B m2 End");
		c1.m4();
	}
}
