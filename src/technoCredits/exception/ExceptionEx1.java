package technoCredits.exception;

public class ExceptionEx1 {

	void m1(int y) {
		System.out.println(1);
		System.out.println(2);
		try {
			int x = 10/y;
			System.out.println("X is " + x);
			x++;
			int z = x + 10;
			System.out.println(z);
		}catch(NullPointerException ae) {
			System.out.println("Hello");
		}
		System.out.println(3);
		System.out.println(4);
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		ExceptionEx1 ex1 = new ExceptionEx1();
		ex1.m1(0);
	}
}
