package surbhi;

public class ClassA {

	void m1() {
		System.out.println("A,m1");
		ClassB b = new ClassB();
		b.m2();
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.m1();

	}
}
