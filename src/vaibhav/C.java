package vaibhav;

public class C {
	
	void m4() {
		System.out.println("In Class C:: M4 Metod");
		C c = new C();//we can directly call m5 method from m4 as both are non-static but as per best practice we should call non static methods by creating an object.
		c.m5();
	}
	
	void m5() {
		System.out.println("In Class C:: M5 Metod");
		D.m6();
	}

}
