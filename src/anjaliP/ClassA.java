package anjaliP;

public class ClassA {
	void m1() {
		System.out.println("Method m1 from ClassA is calling m2 from ClassB");
		ClassB bClass = new ClassB();
		bClass.m2();
	}
	public static void main(String[]a) {
		ClassA aClass = new ClassA();
		aClass.m1();
	}
}
