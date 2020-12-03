package nitin;
/* Assignment 31 :  2nd Dec 2020 - Program 2: Do Sum of all numbers and Convert Uppercase into lowercase, lowercase into uppercase using ASCII.
Given String = "Te1ch8n9oC6reDi5TS1", Expected String = "30tECHNOcREdIts" */
public class OperationsUsingAscii {
	public void sumAndConversionUsingAscii(String str){
		System.out.println("Input String --> "+str);
		String word="";
		int sum=0;
		int temp=0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				temp=Character.getNumericValue(ch);
				sum+=temp;
			}
			else {
				int asciiValue=ch;
				if(asciiValue>=65 && asciiValue<=90) {
					ch=(char)(asciiValue+32);
					word+=ch;
				}
				if(asciiValue>=97 && asciiValue<=122) {
					ch=(char)(asciiValue-32);
					word+=ch;
				}
			}
		}
		System.out.println("Expected String --> "+sum+word);
	}
	public static void main(String[] args) {
		OperationsUsingAscii operationsUsingAscii = new OperationsUsingAscii();
		String input ="Te1ch8n9oC6reDi5TS1";
		operationsUsingAscii.sumAndConversionUsingAscii(input);
	}
}
