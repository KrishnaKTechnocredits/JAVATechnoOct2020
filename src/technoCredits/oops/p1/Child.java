package technoCredits.oops.p1;

import technoCredits.oops.p2.Parent1;

public class Child implements Parent1{
	
	void m100(int x) {
		String m = "";
	}
	
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.m100('a');
	}
}
