package prasad;
import java.util.Scanner;
/*Program 1: return a reserve number.
input : 1234
output : 4321*/

public class ReverseNumber {
	
	int reverseNo(int number) {
		int reverseNo=0;
		int digit=0;
		while(number>0) {
			digit = number%10;
			reverseNo=(reverseNo*10)+digit;
			number=number/10;
		}
		return reverseNo;
	}
	
	public static void main(String[]arg) {
		ReverseNumber reversenumber = new ReverseNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any number(atleast two digit)");
		int number = scanner.nextInt();
		int output = reversenumber.reverseNo(number);
		System.out.println("Reverse of given number: " + output);
	
	}
}
