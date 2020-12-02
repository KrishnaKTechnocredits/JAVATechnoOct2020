package technoCredits.staticNonstatic;

public class Example3 {
	static int x = 10;
	int y = 20;
	
	void m1() {
		m2();
	}
	
	static void m2() {
		//Example3 example3 = new Example3();
		System.out.println("This is m2 " + x);
	}
	
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		example3.m1();
	}
}
