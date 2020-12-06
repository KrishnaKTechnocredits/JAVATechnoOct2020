package anjaliS;

import java.util.Scanner;

public class ReverseNumWithUserInput {
	void displayRevNum(int num) {
		int rev = 0, rem = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse of given number is: " + rev);
	}

	public static void main(String[] args) {
		ReverseNumWithUserInput reversenumwithuserinput = new ReverseNumWithUserInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		reversenumwithuserinput.displayRevNum(number);

	}

}
