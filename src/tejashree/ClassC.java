package tejashree;

public class ClassC {
	
	public void m4() {
		System.out.println("C m4()");
		ClassC classC=new ClassC();
		classC.m5();
		
	}
	public void m5() {
		System.out.println("C m5()");
		ClassD.m6();
	}

}
