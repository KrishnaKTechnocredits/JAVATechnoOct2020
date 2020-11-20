package kajolMultipleClassesCommunication;

public class D {
	
	static void m6() {
		System.out.println("Class D: Method m6 is Static Method.");
		System.out.println("Method m6 of Class D is calling Static Method m7 of same Class D,hence object Creation is not necessary.");
		System.out.println();
		D.m7(); 
	}
	
	static void m7() {
		System.out.println("Class D: Method m7 is Static Method.");
	}

}
