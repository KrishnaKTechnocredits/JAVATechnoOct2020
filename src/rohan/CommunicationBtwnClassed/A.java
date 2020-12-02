package rohan.CommunicationBtwnClassed;

public class A {

	void m1() {
		B b= new B();
		System.out.println("A: m1");
		b.m2();
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
}
