package shrutiS.multipleClassCalling;

public class ClassA {
	
	void m1() {
		System.out.println("ClassA M1 calling M2 of Class B");
		ClassB classb = new ClassB();
		classb.m2();
	}
	
	public static void main(String[] a) {
		ClassA classa = new ClassA();
		System.out.println("ClassA starts with calling M1");
		classa.m1();
	}

}
