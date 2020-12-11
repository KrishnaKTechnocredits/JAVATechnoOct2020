package prasad;

public class A {
	void m1() {
		System.out.println("This is m1 method of Class A");
		System.out.println("m1 method calling non static m2 method of Class B");
		B b = new B();
		b.m2();
	}

	public static void main(String[]arg) {
		System.out.println("Start:-");
		A a = new A();
		a.m1();	 
	}
}
