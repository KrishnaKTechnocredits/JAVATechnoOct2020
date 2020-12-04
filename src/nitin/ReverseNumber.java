package nitin;
/* Assignment 33 : Program 1: return a reserve number.
input : 1234, output : 4321*/
public class ReverseNumber {
	public void getReverseNumber(int num) {
		System.out.println("Input Number is "+num);
		int reverseNum=0;
		while(num>0){
			int mod=num%10;
			num=num/10;
			reverseNum=reverseNum*10+mod;
		}System.out.println("Reverse number = "+reverseNum);
	}
	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();
		reverseNumber.getReverseNumber(123456789);
	}
}
