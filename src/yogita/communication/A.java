package yogita.communication;

public class A {
	
	void m1() {
	   System.out.println("m1 of A");
	    B b = new B();
	    b.m2();
	}
	
 public static void main(String [] args) {
		A a = new A();
		a.m1();
	}
}
