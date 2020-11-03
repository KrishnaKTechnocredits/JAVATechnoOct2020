package prasad;

public class D {
	static void m6() {
		System.out.println("This is m6 static method of Class D");
		System.out.println("m6 method calling another static method m7 of same class");
		m7();
	}
	static void m7() {
		System.out.println("This is m7 static method of Class D");
		System.out.println("End.");
	}
}
