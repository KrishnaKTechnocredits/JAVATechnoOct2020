package suresh;

public class C {
	void m4() {
		System.out.println(" Calling Class C - Method 5");
		m5();
	}
	
	void m5() {
		System.out.println(" Calling Class D - Method 6");
		D.m6();
	}
	
}
