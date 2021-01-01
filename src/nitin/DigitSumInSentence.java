package nitin;
/* Assignment - 25 : 22nd Nov'2020 - Program 1: sum of all numbers from give string.  
String msg = I have 15 years and 2 months of experience.
hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. */
public class DigitSumInSentence {
	void digitSumSentence(String sentence) {
		System.out.println("Sentence :: "+sentence);
		int sum=0;
		String word, temp ="";
		String[] str=sentence.split("");
		for(int index=0;index<str.length;index++) {
			word=str[index];
			for(int inner=0;inner<word.length();inner++) {
				if(Character.isDigit(word.charAt(inner))) 
					temp+=word.charAt(inner);
				else if(!(temp.equals(""))) {
					sum+=Integer.parseInt(temp);
					temp="";
				}
			}
		}
		System.out.println("Digit's sum in the given Sentence :: "+sum);
	}
	public static void main(String[] args) {
		new DigitSumInSentence().digitSumSentence("I have 15 years and 2 months of experience.");
	}
}
	