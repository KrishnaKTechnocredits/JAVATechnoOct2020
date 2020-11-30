package technoCredits.staticNonstatic;

public class Example6 {
	int x  = 10;
	static Example6 example6; // null
	
	static void m1() {
		example6.x = example6.x + 10;
	}
	
	void m2() {
		m1();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		example6 = new Example6();
		example6.m2();
		example6.m2();
	}
	
}
