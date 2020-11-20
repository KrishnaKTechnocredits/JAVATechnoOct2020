package shrutiS.multipleClassCalling;

public class ClassB {
	void m2() {
		System.out.println("ClassB M2 calling M3");
		m3();
	}
	static void m3() {
		ClassC classc = new ClassC();
		System.out.println("ClassB M3 calling M4 of Class C");
		classc.m4();
	}

}
