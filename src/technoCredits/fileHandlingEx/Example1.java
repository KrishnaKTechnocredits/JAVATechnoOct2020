package technoCredits.fileHandlingEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {
	static void getFreq(String line) {
		int count = 0;
		// split 
		System.out.println(line + " : " + count);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\technoCredits\\fileHandlingEx\\readme.txt"));
		String line = "";
		while((line = br.readLine()) != null) {
			System.out.println(line);
			getFreq(line);
		}
	}
}
