package priyanka.communicationBetweenClasses;

public class ClassC {

	void m4() {

		System.out.println("Calling non static method m4 of ClassC");
		ClassC classC = new ClassC();
		classC.m5();
	}

	void m5() {

		System.out.println("Calling non static method m5 of ClassC");
		ClassD.m6();
	}

}
