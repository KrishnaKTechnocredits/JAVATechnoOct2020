package technoCredits.staticNonstatic;

public class Example7 {
	static Example7 example7 = new Example7();
	int x = 10;
	
	void m1() {
		System.out.println("M1 : Started");
		example7.m2();
	}
	
	void m2() {
		System.out.println("M2");
	}
	
	public static void main(String[] args) {
		System.out.println("Main started ......");
		example7.m1();
	}
}
