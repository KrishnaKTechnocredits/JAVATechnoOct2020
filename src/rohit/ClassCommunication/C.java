package rohit.ClassCommunication;

public class C {
	void m4() {
		System.out.println("In non-static method C.m4");
		m5();
	}

	void m5() {
		System.out.println("In non-static method C.m5");
		D.m6();
	}

}
