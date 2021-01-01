/*Assignment : 43 [23rd Dec'2020]
WAP to sum numbers from below String
input: I have 5.6 years of exp in automation and 2.3 in manual testing
output: 7.9
hint: Double's parse method
use exception handling*/
package mrunal;

public class sumNumberString {

	void DisplaySumFromString(String str) {
		
		String[] words=str.split(" ");
		double sum=0;
		
		for(int index=0;index<words.length;index++) {
			String ch=words[index];
			try {
				if(Character.isDigit(ch.charAt(0)))
					sum+=Double.parseDouble(ch);
			}
			catch(NumberFormatException ne) {
				ne.printStackTrace();
			}
		}
		System.out.println("Sum of numbers in String is: "+sum);
	}
	public static void main(String[] args) {
		sumNumberString SumNumberString =new sumNumberString();
		String str="I have 5.6 years of exp in automation and 2.3 in manual testing";
		System.out.println(str);
		SumNumberString.DisplaySumFromString(str);
	}
}
