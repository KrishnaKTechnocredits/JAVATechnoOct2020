package ankit.inBetweenMethodsCall;

public class D {
	
	static void m6() {
		System.out.println("Calling static method M7");
		m7();
	}
	static void m7() {
		System.out.println("Last call is made inside m7 to check the flow");
	}
}
