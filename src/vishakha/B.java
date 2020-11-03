package vishakha;

public class B {

	void m2(){
		System.out.println("Calling static method m3 of class B");
		B.m3();
	}
	
	static void m3(){
		System.out.println("Calling non static method m4 of class C");
		C c = new C();
		c.m4();
	}
}
