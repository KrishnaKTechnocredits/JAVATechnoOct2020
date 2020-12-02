package raghvendra.staticMethod;

public class ClassB {
	
	public void m2() {
		System.out.println("Method m2 of Class B calling static method m3 of same class");
		ClassB.m3();
	}
	
	static void m3() {
		System.out.println("Static Method m3 inside Class B calling m4 of class C");
		ClassC classC=new ClassC();
		classC.m4();
	}

}
