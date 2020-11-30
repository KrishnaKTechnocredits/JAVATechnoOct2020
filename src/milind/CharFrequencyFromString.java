package milind;

import java.util.Scanner;

public class CharFrequencyFromString {
	
	void checkcharFrequency(String userString, char ch) {
		int counter = 0;
		for(int index = 0; index < userString.length(); index++) {
			if(userString.charAt(index) == ch) {
				counter++;
			}
		}
		System.out.println("Frequency of "+ ch +" is : " +counter);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CharFrequencyFromString charFrequencyFromString = new CharFrequencyFromString();
		System.out.println("Enter String for check character frequency : ");
		String userString = scanner.next();
		System.out.println("Enter Char for check frequncy : ");
		String temp = scanner.next();
		int count = 1;
		while(temp.length() != 1 && count < 3) {
			System.out.println("Please Enter only char : ");
			temp = scanner.next();
			count++;
		}
		if(temp.length() != 1) {
			System.out.println("Tried multiple invalid attempt");
		}else {
			char ch = temp.charAt(0);
			System.out.println(ch);
			charFrequencyFromString.checkcharFrequency(userString, ch);
			}
	}

}
