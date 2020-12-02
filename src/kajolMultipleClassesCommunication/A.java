package kajolMultipleClassesCommunication;

public class A {
	
	void m1() {
		System.out.println("Class A: Method m1 is Non Static Method.");
		System.out.println("Method m1 of Class A is calling  Non Static Method m2 of Class B,hence object Creation is must,as both classes are independent of each other.");
		System.out.println();
		new B().m2();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method is  Static Method");
		System.out.println("Main Method is calling  Non Static Method m1,hence object Creation is must.");
		System.out.println();
		A a=new A();
		a.m1();
	}
}
