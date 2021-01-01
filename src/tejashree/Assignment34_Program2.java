package tejashree;

import java.util.Scanner;

/*Program 2: verify number is palindrom or not.
input : 121121*/
public class Assignment34_Program2 {
		void checkPalindromNumber(int num) {
			int reminder, temp, reverse = 0;
			temp = num;
			while (num>0) {
				reminder= num%10;
				reverse= reverse * 10 + reminder;
				num= num/10;
			}
			if (temp == reverse)
				System.out.println(temp + " Number Is Palindrome");
			else
				System.out.println(temp + " Number Is Not Palindrome");
		}

		public static void main(String[] args) {
			Assignment34_Program2 palindromNumber = new Assignment34_Program2();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter The Number");
			int num = scanner.nextInt();
			palindromNumber.checkPalindromNumber(num);
		}
}