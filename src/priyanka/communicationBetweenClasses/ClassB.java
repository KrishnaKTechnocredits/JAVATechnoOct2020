package priyanka.communicationBetweenClasses;

public class ClassB {

	void m2() {

		System.out.println("Calling non static method m2 of ClassB");
		ClassB.m3();
	}

	static void m3() {

		System.out.println("Calling static method m3 of ClassB");
		ClassC classC = new ClassC();
		classC.m4();
	}

}
