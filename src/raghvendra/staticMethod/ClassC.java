package raghvendra.staticMethod;

public class ClassC {
	public void m4() {
		System.out.println("Method m4 of calss C calling method m5 of same class");
		m5();
	}
	
	public void m5() {
		System.out.println("Method m5 of calss C calling static method m6 of class D");
		ClassD.m6();
	}

}
