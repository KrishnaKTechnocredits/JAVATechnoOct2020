package priyanka.communicationBetweenClasses;

public class ClassA {

	void m1() {

		System.out.println("Calling non Static method m1 of ClassA");
		ClassB classB = new ClassB();
		classB.m2();
	}

	public static void main(String[] a) {
		ClassA classA = new ClassA();
		classA.m1();

	}

}
