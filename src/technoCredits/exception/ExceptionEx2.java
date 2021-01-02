package technoCredits.exception;

public class ExceptionEx2 {

	void m1(int y) {
		System.out.println(1);
		System.out.println(2);
		try {
			int x = 10/y;
			System.out.println("X is " + x);
			x++;
			int z = x + 10;
			ExceptionEx1 ex1 = null;
			ex1.m1(100);
			System.out.println(z);
		}catch(NullPointerException ae) {
			System.out.println("Hello");
		}catch(ArithmeticException ae) {
			System.out.println("You understood well");
		}
		System.out.println(3);
		System.out.println(4);
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		ExceptionEx2 ex2 = new ExceptionEx2();
		ex2.m1(10);
	}
}
