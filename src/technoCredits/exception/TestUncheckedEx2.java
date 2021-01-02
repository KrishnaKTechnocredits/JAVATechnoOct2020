package technoCredits.exception;

public class TestUncheckedEx2 {

	void m3() throws IndexOutOfBoundsException{
		int x[] = {10,20};
		System.out.println(x[2]);
	}
}
