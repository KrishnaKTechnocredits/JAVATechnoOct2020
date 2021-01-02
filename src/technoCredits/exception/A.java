package technoCredits.exception;

import java.io.FileNotFoundException;

public class A {
	void m1() throws ArithmeticException, FileNotFoundException {
		System.out.println("A m1 Start");
		B b1 = new B();
		b1.m2();
		System.out.println("Vaibhav");
		System.out.println("A m1 End");
	}


	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Main Start");
		A a = new A();
		try {
			a.m1();
		} catch (ArithmeticException ae) {
			System.out.println("Main Method Try Catch");
		}
		System.out.println("Main End");
	}
}
