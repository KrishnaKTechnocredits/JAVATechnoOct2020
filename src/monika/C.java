package monika;
public class C {

	void m4() {
		System.out.println("Calling method M5");
		m5();
	}

	void m5() {
		System.out.println("Calling static method M6");
		
		D.m6();
	}

}