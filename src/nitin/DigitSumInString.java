package nitin;
/* Assignment - 24 : 22nd Nov'2020 -Program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18 */
public class DigitSumInString {
	public void digitSum(String word) {
		System.out.println("String :: "+word);
		int sum=0;
		for(int index=0;index<word.length();index++) {
			char ch=word.charAt(index);
			if(Character.isDigit(ch)) {
				sum+=Character.getNumericValue(ch);
			}
		}
		System.out.println("Digit's sum in the given String :: "+sum);
	}
	public static void main(String[] args) {
		new DigitSumInString().digitSum("te1ch9kj8");
	}
}
