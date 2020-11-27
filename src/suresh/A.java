package suresh;

public class A {
	void m1() {
		System.out.println(" Calling Class A - Method 2");
		B b = new B();
		b.m2();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				A a = new A();
		
		System.out.println(" Calling Class A - Method 1");
		a.m1();
		
	}

}
