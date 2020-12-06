package nitin;
/* Assignment 33 : Program 2: verify number is armstrong or not.
input : 153 , output : 153 is an armstrong number.
input : 154 , output : 154 is an armstrong number.*/
public class ArmStrongNumber {
	public void isArmStrongNumber(int number) {
		int sum=0;
		int actualNum=number;
		while(number>0) {
			int mod=number%10;
			number=number/10;
			sum+=(mod*mod*mod);
		}
		if(actualNum==sum)
			System.out.println(actualNum+" is an ArmStrong Number.");
		else
			System.out.println(actualNum+" is not an ArmStrong Number.");
	}
	public static void main(String[] args) {
		ArmStrongNumber armStrongNumber = new ArmStrongNumber();
		armStrongNumber.isArmStrongNumber(153);
		armStrongNumber.isArmStrongNumber(154);
	}
}
