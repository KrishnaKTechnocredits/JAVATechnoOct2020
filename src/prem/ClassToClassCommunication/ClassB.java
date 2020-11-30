package prem.ClassToClassCommunication;

// Assignment#10
// Communication between Class

public class ClassB {
	
	void m2() {
		
		System.out.println("Non Static m2 of ClassB");
		
		ClassB.m3();
	}
	
	static void m3() {
		
		System.out.println("Static m3 of ClassB");
		
		ClassC classC = new ClassC();
		
		classC.m4();                                   //m3 calling m4 of class C
	}
}
