package milind;

import java.util.Scanner;

public class NumberPalindrom {
	
	void verifyIsNumberPalindrom(int number) {
		int temp = number;
		int reverseNumber = 0;
		while(temp > 0) {
			int modOfNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + modOfNumber;
			temp = temp / 10;
		}
		if(number == reverseNumber) {
			System.out.println(number + " is palindrom");
		}else {
			System.out.println(number + " is not palindrom");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = scanner.nextInt();
		NumberPalindrom numberPalindrom = new NumberPalindrom();
		numberPalindrom.verifyIsNumberPalindrom(number);
		scanner.close();
	}

}
