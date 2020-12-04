package raghvendra.StringArrays;
/*Program 2: verify number is palindrom or not.
input : 121121*/
public class FindNumberPalindrom {
	void checkPalindromNumber(int number) {
		boolean flag=false;
		String convertNumber=Integer.toString(number);
		for(int index=0, lastIndex=convertNumber.length()-1;index<lastIndex;index++, lastIndex--) {
			int firstNumber=Character.getNumericValue(convertNumber.charAt(index));
			int lastNumber=Character.getNumericValue(convertNumber.charAt(lastIndex));
			if(firstNumber!=lastNumber) {
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println(number+" is not palindrom string");
		else
			System.out.println(number+" is palindrom string");
	}
	public static void main(String[] args) {
		FindNumberPalindrom findNumberPalindrom=new FindNumberPalindrom();
		int number=121121;
		findNumberPalindrom.checkPalindromNumber(number);
		int number2=141121;
		findNumberPalindrom.checkPalindromNumber(number2);
		int number3=151;
		findNumberPalindrom.checkPalindromNumber(number3);
	}
}
