package milind;

import java.util.Scanner;

public class ReverseNumber {
	
	void numberReverse(int number) {
		int reverseNumber = 0;
		while(number > 0) {
			int modOfNum = number % 10;
			reverseNumber = (reverseNumber * 10) + modOfNum;
			number = number / 10;
		}
		System.out.println("Reverse number is : " + reverseNumber);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for reverse : " );
		int number = scanner.nextInt();
		ReverseNumber reverseNumber = new ReverseNumber();
		reverseNumber.numberReverse(number);
		scanner.close();
	}

}
