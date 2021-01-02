package technoCredits.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestCheckedEx2 {

	void m1() throws IOException, FileNotFoundException{
		File file = new File("");
		FileInputStream fileInputStream = new FileInputStream(file);
	}
	
	void m2() {
		try {
			m1();
		}catch(FileNotFoundException fe) {
			System.out.println(1);
		}catch(Exception ie) {
			System.out.println(2);
		}
	}
	
	public static void main(String[] args) {
		new TestCheckedEx2().m2();
	}
}
