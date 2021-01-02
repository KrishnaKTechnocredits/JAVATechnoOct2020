package technoCredits.exception;

public class ExceptionEx5 {
	void m1() {
		System.out.println("Hi");
	}
	
	void m2() {
		m1();
		try {
		int x = 5/0;
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
	}
	
	void m3() {
		m2();
	}
	
	public static void main(String[] args) {
		ExceptionEx5 ex5 = new ExceptionEx5();
		ex5.m3();
		System.out.println("End");
	}
}
