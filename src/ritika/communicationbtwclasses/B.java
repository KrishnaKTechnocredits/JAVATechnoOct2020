package ritika.communicationbtwclasses;

public class B {

	void m2(){
		System.out.println("B m2 non static method");
		B.m3();
	}
	
	static void m3() {
		System.out.println("B m3 static method");
		new C().m4();
	}
}
