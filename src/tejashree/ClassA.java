package tejashree;

public class ClassA {

	public void m1() {
		System.out.println("A m1()");
		ClassB classB=new ClassB();
		classB.m2();
	}
	
	public static void main(String[] args) {
		ClassA classA=new ClassA();
		classA.m1();
	}

}
