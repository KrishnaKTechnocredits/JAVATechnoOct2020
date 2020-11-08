package ankita.staticExample;

public class A {

	void m1() {
		System.out.println("Class A->Main :Call from non-static to non-static :M1 -> M2 ");
		B b = new B();
		b.m2();
	}
	public static void main(String[]  args) {
		A a =new A();
		a.m1();
	}
}
