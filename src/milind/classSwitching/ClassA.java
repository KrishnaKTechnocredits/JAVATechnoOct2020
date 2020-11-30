package milind.classSwitching;

public class ClassA {
	
	void m1() {
		System.out.println("Class: A m1 : nonStatic method");
		new ClassB().m2();
	}
	
	public static void main(String[] args) {
		new ClassA().m1();
	}

}
