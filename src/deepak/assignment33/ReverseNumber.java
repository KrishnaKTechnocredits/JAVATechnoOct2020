
//Reverse a number without valueOf() and parseInt() method
package deepak.assignment33;

import java.util.Scanner;

public class ReverseNumber {
	
	void processData1(int num) {
		int reverse=0;
		
		while(num != 0) {
			int d = num % 10;
			reverse = reverse * 10 + d;
			num = num / 10;
		}
		System.out.println("Reverse number : "+ reverse);
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		ReverseNumber refVar = new ReverseNumber();
		refVar.processData1(num);
	}
}
