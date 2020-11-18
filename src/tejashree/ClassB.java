package tejashree;

public class ClassB {
	
	public void m2() {
		System.out.println("B m2()");
		m3();
	}

	static void m3() {
		System.out.println("B m3()");
		ClassC classC=new ClassC();
		classC.m4();
		
	}

}
