package technoCredits.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C {
	
	void m3() throws IndexOutOfBoundsException,ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException{
		System.out.println("10");
		int x = 10/0;
		System.out.println(x);
		int[] temp = {10,20};
		System.out.println(temp[3]);
		System.out.println("Enter Transcation in DB");
	}
	
	void m4() throws FileNotFoundException {
		File file = new File("");
		FileInputStream input = new FileInputStream(file);
		
	}
}
