package technoCredits.oops.p1;

public class Example2 extends Example1{
    
	void m3() {
		System.out.println("Child " + x);
	}
	
	void m2() {
		x = 30;
	}
	
	public static void main(String[] args) {
		Example2 ex2 = new Example2();
		ex2.m2();
		ex2.m3(); // child 30 // child 30
		
		Example1 ex4 = new Example1();
		ex4.m4(); // parent 10 // parent 30
	}
	
}
