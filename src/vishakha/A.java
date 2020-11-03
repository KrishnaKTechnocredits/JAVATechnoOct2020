package vishakha;

public class A {
	
	void m1(){
		System.out.println("Calling non static method m2 of class B");
		B b = new B();
		b.m2();
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println("Calling non static method m1 of class A");
		a.m1();
	}
}
