package dhara.Static;

public class D {

	public static void m6() {
		System.out.println("Class D : m6 calling static method of Class D: m7");
		D.m7();
	}
	static void m7() {
		System.out.println("Class D : m7");
	}
}
