package technoCredits.exception;

public class ExceptionEx4 {
	Test test;

	void m1(int y) {
		try {
			System.out.println(1);
			int x = 10 / y;
			System.out.println(x);
			try {
				x = 10 / (y - y);
				test.m2(); // Test m2
			} catch (NullPointerException ne) {
				System.out.println("Test object is not yet created");
			} catch(ArithmeticException ae){
				System.out.println("7");
			}finally {
				System.out.println(100);
			}
			System.out.println("techno");
		} catch (ArithmeticException ae) {
			System.out.println("Hello");
		} finally {
			System.out.println(101);
		}
		System.out.println(50);
	}

	public static void main(String[] args) {
		new ExceptionEx4().m1(10);
	}
}
