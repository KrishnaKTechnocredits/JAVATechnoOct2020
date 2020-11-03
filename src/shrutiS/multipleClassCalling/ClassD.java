package shrutiS.multipleClassCalling;

public class ClassD {
	
	static void m6() {
		System.out.println("ClassD M6 calling M7");
		m7();
	}
	static void m7() {
		System.out.println("ClassD ends with calling M7");
	}

}
