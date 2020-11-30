package ritika.communicationbtwclasses;

public class C {

	void m4() {
		System.out.println("C m4 non static method");
		m5();
	}
	
	void m5() {
		System.out.println("C m5 non static method");
		D.m6(); 
	}
}
