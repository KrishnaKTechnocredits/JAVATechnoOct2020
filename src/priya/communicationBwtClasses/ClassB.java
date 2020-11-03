package priya.communicationBwtClasses;

public class ClassB {
	void m2() {
		System.out.println("non static m2 of ClassB");
		ClassB.m3();
	}
	
	static void m3() {
		System.out.println("static m3 of ClassB");
		ClassC classC = new ClassC();
		classC.m4();
	}
}
