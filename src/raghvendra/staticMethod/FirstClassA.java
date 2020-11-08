package raghvendra.staticMethod;

public class FirstClassA {
	
	void m1() {
		System.out.println("Method M1 inside Class A calling method m2 of class B");
		ClassB classb=new ClassB();
		classb.m2();
	}

	public static void main(String[] args) {
		FirstClassA firstclassa=new FirstClassA();
		firstclassa.m1();
		}
	}
