package mrunal;

public class A{

	void m1() {
		System.out.println("M2 is called by M1 ");
		B b=new B();
		b.m2();
	}
	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
	}

}
