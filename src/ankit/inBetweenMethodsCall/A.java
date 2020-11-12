package ankit.inBetweenMethodsCall;

public class A {

	void m1() {
		System.out.println("Calling method M2");
		B b = new B();
		b.m2();
	}

	public static void main(String[] args) {
		System.out.println("Call between methods flow - Assignment");
		A a = new A();
		a.m1();
	}
}
