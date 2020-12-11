package nitin;
/*Assignment 34: Program 2: verify number is palindrom or not.
input : 121121*/
public class FindPalindromNumber {
	public void isNumberPalindrom(int num) {
		System.out.println("Input Number -->"+num);
		boolean flag=true;
		String str=String.valueOf(num);
		for(int index=0,inner=str.length()-1;index<inner;index++,inner--) {
			if(str.charAt(index)!=str.charAt(inner)) {
				System.out.println(num+" is not a Palindrom Number.");
				flag =false;
				break;
			}
		}
		if(flag)
			System.out.println(num+" is a Palindrom Number.");
	}
	public static void main(String[] args) {
		FindPalindromNumber findPalindromNumber = new FindPalindromNumber();
		findPalindromNumber.isNumberPalindrom(121121);
		findPalindromNumber.isNumberPalindrom(123456);
	}
}
