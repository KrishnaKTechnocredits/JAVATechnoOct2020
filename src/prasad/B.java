package prasad;

public class B {
	void m2() {
		System.out.println("This is m2 method of Class B");
		System.out.println("m2 method calling static m3 method of same class");
		B.m3();
	}
	
	static void m3() {
		System.out.println("This is m3 static method");
		System.out.println("m3 static method calling m4 non static method of Class C");
		C c = new C();
		c.m4();
	}
}
