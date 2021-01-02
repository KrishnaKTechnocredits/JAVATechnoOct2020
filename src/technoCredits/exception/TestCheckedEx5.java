package technoCredits.exception;

public class TestCheckedEx5 {
		
	void m1() {
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		try {
			new TestCheckedEx5().m1();	
		}catch(ArithmeticException ae) {
			System.out.println("1");
			System.out.println(ae.getMessage());
		}
	}
}
