package priya.communicationBwtClasses;

public class ClassA {

	void m1() {
		System.out.println("m1 of ClassA");
		ClassB classB = new ClassB();
		classB.m2();
	}
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.m1();
	}
			
}

