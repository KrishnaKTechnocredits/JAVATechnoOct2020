package nagendra;

public class A {

	void m1() {

		System.out.println("Class A M1 Method");
		B b = new B();
		b.m2();
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}

}
