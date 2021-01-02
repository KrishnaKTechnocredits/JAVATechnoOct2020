package technoCredits.oops.p2;

import technoCredits.oops.p1.Parent;

public class Child extends Parent{
	
	@Override
	public void m2() {
		System.out.println("Child M2");
	}
	
	void m5() {
		m2();
	}
	
	public static void main(String[] args) {
		Parent p1 = new Parent();
		//p1.m2();
		
		Child c1 = new Child();
		c1.m2();
		
		Parent p2 = new Child();
		//p2.m2();
	}
}
