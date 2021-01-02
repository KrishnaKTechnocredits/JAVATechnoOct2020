package technoCredits.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestCheckedEx1 {

	void m1() throws FileNotFoundException{
		File file = new File("");
		FileInputStream fileInputStream = new FileInputStream(file);
	}
	
	void m2() {
		try {
			m1();
		} catch (IOException e) {
			System.out.println("In catch block");
		}
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		new TestCheckedEx1().m2();
		System.out.println(2);
	}
}
