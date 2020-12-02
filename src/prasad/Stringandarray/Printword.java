package prasad.Stringandarray;
/*Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/
public class Printword {
	
	void PrintWordsWithSum(String[]words) {
		System.out.println("Word(s) with sum of all its digits greater than 10 is/are:-");
		for(int index=0;index<words.length;index++) {
			String word = words[index];
			String temp="";
			int sum=0;
			
			for(int innerindex=0;innerindex<word.length();innerindex++) {
				char ch = word.charAt(innerindex);
				if(Character.isDigit(ch)) {
					temp+=ch;
				}
				else if(Character.isLetter(ch)|| !Character.isLetterOrDigit(ch)) {
						if(temp.length()>0) {
						sum+=(Integer.parseInt(temp));
						temp="";
						}
				}
			}
			if(temp.length()>0)
				sum+=(Integer.parseInt(temp));
			if(sum>10)
				System.out.println( word + " , sum = " + sum);
		}
	}
	
	public static void main(String[]arg) {
		Printword printword = new Printword();
		String[] input = {"t8!9hrts#90ay","te3ch2no9","Ma1s3gj3Pw","r4f3sjk","sfjk4p4plpk"};
		printword.PrintWordsWithSum(input);	
	}
}
