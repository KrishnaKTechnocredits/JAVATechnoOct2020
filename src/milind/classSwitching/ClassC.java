package milind.classSwitching;

public class ClassC {
	
	void m4() {
		System.out.println("Class: C, m4 : nonStatic method");
		new ClassC().m5();
	}
	
	void m5() {
		System.out.println("Class: C, m5 : nonStatic method");
		ClassD.m6();
	}

}
