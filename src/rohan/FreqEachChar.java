package rohan;

import java.util.Scanner;

public class FreqEachChar {

	void freqOfEachChar(String str) {
		for(int i=0;i<str.length();i++) {
			int cnt =0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==str.charAt(i))
					cnt++;
			}
			System.out.println("Occurence of Character is "+str.charAt(i)+" "+cnt+" times");
		}
	}
	
	public static void main(String[] args) {
		FreqEachChar fec = new FreqEachChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		fec.freqOfEachChar(str);
	}
}
