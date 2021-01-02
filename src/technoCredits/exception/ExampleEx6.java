package technoCredits.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class ExampleEx6 {

	int m1(int x){
		
		try{
			int y = 10/x;
			File file = new File("D://mmk.txt");
			FileInputStream inputStream = new FileInputStream(file);
			return y;
		}
		catch(NullPointerException ae){
			return 350;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return 300;
		}
		
		finally{
			System.out.println("Hi");
		}
		//return 1000; CE
	}
	
	public static void main(String[] args) {
		int temp = new ExampleEx6().m1(10);
		System.out.println(temp);
	}
	
}
