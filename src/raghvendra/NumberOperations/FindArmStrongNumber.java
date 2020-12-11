package raghvendra.NumberOperations;
/*Program 2: verify number is armstrong or not.
input : 153
output : 153 is an armstrong number.
input : 154 
output : 154 is an armstrong number.*/
public class FindArmStrongNumber {
	void findArmstronNumber(int number) {
		int armstrongNumber=0;
		int givenNumber=number;
		while(givenNumber>0) {
			int mod=givenNumber%10;
			armstrongNumber+=mod*mod*mod;
			givenNumber=givenNumber/10;
		}
		if(number==armstrongNumber)
			System.out.println(+number+" is an armstrong number");
		else
			System.out.println(+number+" is not an armstrong number");
	}
	public static void main(String[] args) {
		FindArmStrongNumber findArmStrongNumber=new FindArmStrongNumber();
		int number=153;
		findArmStrongNumber.findArmstronNumber(number);
		int number2=154;
		findArmStrongNumber.findArmstronNumber(number2);
		int number3=121;
		findArmStrongNumber.findArmstronNumber(number3);
	}
}
