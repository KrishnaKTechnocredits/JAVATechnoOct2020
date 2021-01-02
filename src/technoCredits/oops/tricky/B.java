package technoCredits.oops.tricky;

public class B extends A{
	
	int x = 20;
	
	@Override
	void m1() {
		System.out.println(x); // 
		System.out.println(x-x+10); // 
	}
	
	public static void main(String[] args) {
		 A b1 = new B();
		 b1.m1(); // 
		 System.out.println("------" + b1.x);
		 //b1.m1(); // 10 // 
		 //System.out.println(b1.x);
	}
}
