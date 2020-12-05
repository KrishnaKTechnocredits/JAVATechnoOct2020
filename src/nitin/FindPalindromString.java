package nitin;
/* Assignment 34: Program 1: verify string is palindrom or not.
input : naman, output : naman is a palindrom string.
input : techno, output : techno is not a palindrom string.*/
public class FindPalindromString {
	public void isStringPalindrom(String str) {
		System.out.println("Input String -->"+str);
		boolean flag=true;
		for(int index=0,inner=str.length()-1;index<inner;index++,inner--) {
			if(str.charAt(index)!=str.charAt(inner)) {
				System.out.println(str+" is not a Palindrom String.");
				flag =false;
				break;
			}
		}
		if(flag)
			System.out.println(str+" is a Palindrom String.");
	}
	public static void main(String[] args) {
		FindPalindromString findPalindromString = new FindPalindromString();
		findPalindromString.isStringPalindrom("nitin");
		findPalindromString.isStringPalindrom("techno");
	}
}
