package ritika.communicationbtwclasses;

public class A {
	void m1() {
		System.out.println("A.m1 non static method");
		new B().m2();
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}

}
