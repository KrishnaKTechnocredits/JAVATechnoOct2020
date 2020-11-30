package vaibhav;

public class A {
	
	void m1() {
		System.out.println("In Class A:: M1 Metod");
		B b = new B();
		b.m2();
	}
	
	public static void main(String [] args){
		
		A a = new A();
		a.m1();		
	}

}
