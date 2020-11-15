package technoCredits.staticNonstatic;

public class Example5 {
	int x  = 10;
	
	static void m1() {
		Example5 example5 = new Example5();
		example5.x = example5.x + 10;
	}
	
	void m2() {
		m1();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new Example5().m2();
		new Example5().m2();
	}
	
}
