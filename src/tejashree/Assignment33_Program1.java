package tejashree;

/*Program 1: return a reserve number.
input : 1234
output : 4321
*/
import java.util.Scanner;

public class Assignment33_Program1 {

	void getReverseNumber(int num) {
		int reverseNum = 0, remainder;
		while (num >0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}
		System.out.print("Reverse Number is : " + reverseNum);
	}

	public static void main(String[] args) {
		Assignment33_Program1 reverseNumber = new Assignment33_Program1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("Number is : " + num);
		reverseNumber.getReverseNumber(num);
	}
}