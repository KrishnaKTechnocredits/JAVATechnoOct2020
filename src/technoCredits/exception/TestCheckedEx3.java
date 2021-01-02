package technoCredits.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestCheckedEx3 {

	void m1() throws FileNotFoundException{
		File file = new File("");
		try {
			System.out.println("Before");
			Thread.sleep(5000);
			System.out.println("After");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream fileInputStream = new FileInputStream(file);
	}
	
	void m2() throws FileNotFoundException, InterruptedException {
		try {
			m1();
		}catch(FileNotFoundException fe) {
			System.out.println(1);
			System.exit(-1); // 
		}
		System.out.println("Hi");
	}
	
	public static void main(String[] args) throws InterruptedException{
		try {
			new TestCheckedEx3().m2();
		} catch (FileNotFoundException e) {
		}
		System.out.println("End");
	}
}
