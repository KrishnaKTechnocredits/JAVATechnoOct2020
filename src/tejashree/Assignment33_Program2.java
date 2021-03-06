package tejashree;

/*Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.*/

import java.util.Scanner;

public class Assignment33_Program2 {

	void findArmstrongNumber(int num) {
		int sum = 0;
		int remainder = 0;
		int temp = num;
		while (num >0) {
			remainder = num % 10;
			sum += (remainder * remainder * remainder);
			num = num / 10;
		}
		if (temp == sum)
			System.out.println(temp + " " + "Is an Armstrong Number");
		else
			System.out.println(temp + " " + "Is Not an Armstrong Number");
	}

	public static void main(String[] args) {
		Assignment33_Program2 armstrongNumber = new Assignment33_Program2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		System.out.println("Number is: " + num);
		armstrongNumber.findArmstrongNumber(num);
	}
}