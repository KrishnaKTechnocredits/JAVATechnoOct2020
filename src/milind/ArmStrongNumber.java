package milind;

import java.util.Scanner;

public class ArmStrongNumber {
	
	void verifyIsArmstrongNumber(int number) {
		int temp = number;
		int sumForCheckArmstong = 0;
		while(temp > 0) {
			int modOfNum = temp % 10;
			sumForCheckArmstong = sumForCheckArmstong + (modOfNum * modOfNum * modOfNum);
			temp = temp/10;
		}
		if(number == sumForCheckArmstong) {
			System.out.println(number + " Number is Armstrong");
		}else {
			System.out.println(number + " Number is not ArmStrong");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number " );
		int number = scanner.nextInt();
		ArmStrongNumber armStrongNumber = new ArmStrongNumber();
		armStrongNumber.verifyIsArmstrongNumber(number);
		scanner.close();
	}

}
