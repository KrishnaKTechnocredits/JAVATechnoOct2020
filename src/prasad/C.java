package prasad;

public class C {
	void m4() {
		System.out.println("This is m4 non-static method of Class C");
		System.out.println("m4 method calling m5 non-static method of same class");
		m5();
	}
	
	void m5() {
		System.out.println("This is m5 non-static method of Class C");
		System.out.println("m5 method calling m6 static method of Class D");
		D.m6();
	}
}
