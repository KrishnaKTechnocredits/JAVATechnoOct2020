package technoCredits.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestCheckedEx4 {

	int m1(int x) throws FileNotFoundException {
		if (x >= 0) {
			int ans = 10 / x;
			System.out.println(ans);
			return ans;
		}
		throw new FileNotFoundException();
	}

	void m2() throws Exception {
		System.out.println("Before M2");
		try {
			m1(0);
			System.out.println("1");
		}catch(Exception e) {
			
		}
		//throw new ArithmeticException();
		System.out.println("After M2");
	}

	public static void main(String[] args) {
		try {
			new TestCheckedEx4().m2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
