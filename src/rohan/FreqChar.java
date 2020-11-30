package rohan;
/*Same as Assignment 16 but each frequency should be printed single time.
input : aakanksha
output : a -> 4
              k -> 2
              n -> 1
              s -> 1
              h -> 1*/

import java.util.Scanner;

public class FreqChar {
	void freqOfEachChar(String str) {
		for(int i=0;i<str.length();i++) {
			int cnt =0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==str.charAt(i))
				cnt++;
			}
		//	char ch = Character.toLowerCase(str.charAt(i));
			if(str.indexOf(Character.toLowerCase(str.charAt(i)))==i)
				System.out.println("Occurence of Character is "+str.charAt(i)+" "+cnt+" times");
		}
	}
	
	public static void main(String[] args) {
		FreqChar fec = new FreqChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		fec.freqOfEachChar(str);
		sc.close();
	}
}
