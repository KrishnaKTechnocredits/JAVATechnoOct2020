package priya.communicationBwtClasses;

public class ClassC {
	void m4() {
		System.out.println("non static m4 of ClassC");
		ClassC classC = new ClassC();
		classC.m5();
	}
	
	void m5() {
		System.out.println("non static m5 of ClassC");
		ClassD.m6();
	}
			

}
