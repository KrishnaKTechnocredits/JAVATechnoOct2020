package milind.classSwitching;

public class ClassB {
	
	void m2() {
		System.out.println("Class: B, m2 : nonStatic method");
		ClassB.m3();
	}
	
	static void m3() {
		System.out.println("Class: B, m3 : static method");
		new ClassC().m4();
	}

}
