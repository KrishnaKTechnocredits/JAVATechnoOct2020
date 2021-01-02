package technoCredits.oops.abstraction;

public class TestJava8 implements I1{

	@Override
	public void m1() {}

	@Override
	public void m2() {}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
	
	static public void m7() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		I1.m7(); // Parent
		TestJava8 i1 = new TestJava8(); 
		i1.m7(); // Child
		TestJava8.m7(); // Child
	}
	

}
