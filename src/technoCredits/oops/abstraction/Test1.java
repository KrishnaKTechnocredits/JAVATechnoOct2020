package technoCredits.oops.abstraction;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1 {

	static int getDigitSum(String line) { 
		int sum = 0;
		for(int index=0; index<line.length(); index++) {
			char ch = line.charAt(index);
			if(Character.isDigit(ch))
				sum += ch;
		}
		return sum;
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String readLine = "";
		while ((readLine = br.readLine()) != null) {
			int digitsum = getDigitSum(readLine);
			System.out.println(digitsum);
		}
	}
}
