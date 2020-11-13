package shrutiS.multipleClassCalling;

public class ClassC {

	void m4() {
		System.out.println("ClassC M4 calling M5");
		m5();
	}
	void m5() {
		System.out.println("ClassC M5 calling M6 of ClassD");
		ClassD.m6();
	}
	
}
