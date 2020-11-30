package anurag;

public class A {
	
	void m1() {
		
		B b = new B();
		b.m2();	
		System.out.println("A m1");
		
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		
	}
      
}
