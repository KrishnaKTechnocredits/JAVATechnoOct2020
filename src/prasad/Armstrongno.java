package prasad;
import java.util.Scanner;
/*Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154
output : 154 is an armstrong number.*/

public class Armstrongno {
	boolean isAramstrong(int number) { //32
		int digit=0;
		int sum=0;
		int temp=number;
		while(number>0) {
			digit = number%10; // 2
			sum +=(digit*digit*digit);
			number=number/10; //3 
		}
		if(sum==temp)
			return true;
		else 
			return false;
	}
	
	public static void main(String[]arg) {
		Armstrongno Armstrongno = new Armstrongno();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is entered number a Armstrong number?");
		System.out.println("==================================================");
		System.out.println("Please enter any number(atleast two digit):-");
		int number = scanner.nextInt();
		boolean flag = Armstrongno.isAramstrong(number);
		if(flag)
			System.out.println("Yes "+ number + " is a Armstrong number.");
		else 
			System.out.println("No " + number + " is NOT a Armstrong number.");
		System.out.println("==================================================");
		System.out.println("Please enter any number(atleast two digit):-");
		 number = scanner.nextInt();
		 flag = Armstrongno.isAramstrong(number);
		if(flag)
			System.out.println("Yes "+ number + " is a Armstrong number.");
		else 
			System.out.println("No " + number + " is NOT a Armstrong number.");
		
	}
}
