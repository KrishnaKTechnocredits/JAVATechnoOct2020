package nandini.commBtwClasses;

public class C {

	void m4(){
		System.out.println("Calling non static method m5 of class C");
		m5();
	}
	
	void m5(){
		System.out.println("Calling static method m6 of class D");
		D.m6();
	}
}
