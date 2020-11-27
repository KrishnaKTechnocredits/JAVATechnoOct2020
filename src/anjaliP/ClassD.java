package anjaliP;

public class ClassD {
	static void m6() {
		System.out.println("Method m7 called from method m6 from same class");
		ClassD.m7();
	}
	static void m7() {
		System.out.println("Method m7 of Class D");
	}
}
