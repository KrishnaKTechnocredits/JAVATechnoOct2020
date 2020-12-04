package raghvendra.NumberOperations;
/*Program 1: return a reserve number.
input : 1234
output : 432*/
public class ReverseNumber {
	void reverseNumber(int number){
		int reverseNumber=0;
		while(number>0) {
			int num=number%10;
			reverseNumber=(reverseNumber*10)+num;
			number=number/10;
		}
		System.out.println(reverseNumber);
	}
	public static void main(String[] args) {
		ReverseNumber reverseNumber=new ReverseNumber();
		int number=1739;
		reverseNumber.reverseNumber(number);
	}
}
