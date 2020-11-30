package dhara.Static;

public class B {

	public void m2() {
		System.out.println("Class B : m2 calling static method of class B : m3");
		B.m3();
	}
	
	static void m3() {
		System.out.println("Class B : m3 calling non static method of Class C : m4");
		C c=new C();
		c.m4();
	}
}
