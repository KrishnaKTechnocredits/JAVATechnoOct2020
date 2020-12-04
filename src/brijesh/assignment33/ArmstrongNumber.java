package brijesh.assignment33;

/*
Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.
*/

public class ArmstrongNumber {
	
	public void isNumberArmstrong(int number) {
		int sum=0, originalNumber=number;
		while(number>0) {
			int mod = number%10;
			number=number/10;
			sum+=mod*mod*mod;
		}
		if(originalNumber==sum)
			System.out.println(originalNumber+" is an armstrong number");
		else
			System.out.println(originalNumber+" is not an armstrong number");
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		armstrongNumber.isNumberArmstrong(153);
		armstrongNumber.isNumberArmstrong(199);
		armstrongNumber.isNumberArmstrong(154);
	}
}
