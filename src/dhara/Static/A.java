package dhara.Static;

public class A {

	void m1() {
		System.out.println("Class A : m1 calling non static method of Class B : m2 ");
		B b=new B();
		b.m2();
	}
	
	public static void main(String[] args) {
		
		A a =new A();
		a.m1();
	}
}
