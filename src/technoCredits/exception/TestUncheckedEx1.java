package technoCredits.exception;

public class TestUncheckedEx1 {

	
	void m4() {
		try {
			new TestUncheckedEx2().m3();
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("IN catch");
		}
	}
	
	 public static void main(String[] args) {
		new TestUncheckedEx1().m4();
	}
}
