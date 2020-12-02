package nitin;
/* Assignment - 24 : 22nd Nov'2020 - Program 2 : sum of all numbers in a given string - 
input: te123ch9kj8 
output : 123 + 9 + 8 = 140 */
public class DigitSumInString2 {
	void digitSum(String word) {
		System.out.println("String :: "+word);
		int sum=0;
		String s="";
		for(int index=0;index<word.length();index++) {
			char ch=word.charAt(index);
			if(Character.isDigit(ch)) 
				s+=ch;
			else if(s!="") {
				sum+=Integer.parseInt(s);
				s="";
			}
		}
		sum+=Integer.parseInt(s);
		System.out.println("Digit's sum in the given String :: "+sum);
	}
	public static void main(String[] args) {
		new DigitSumInString2().digitSum("te123ch9kj8");
	}
}