package raghvendra.staticMethod;

public class ClassD {
	static void m6() {
		System.out.println("Method m6 of calss D calling static method m7 of same calss");
		m7();
	}
	
	static void m7() {
		System.out.println("Method m7 of calss D");
	}

}
