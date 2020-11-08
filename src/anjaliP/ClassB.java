package anjaliP;

public class ClassB {

	void m2() {
		System.out.println("Method m2 from ClassB calling m3 from same Class");
		m3();
	}
	
	static void m3() {
		System.out.println("Method M3 from ClassB calling m4 from ClassC");
		ClassC c = new ClassC();
		c.m4();
	}
}
