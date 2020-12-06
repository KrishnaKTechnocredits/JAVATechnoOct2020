package nitin;
/* Assignment 31 :  2nd Dec 2020 - Program 1: Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS", Expected String = "technocredits"*/
public class ConversionUsingASCII {
	public void stringConvertUsingASCII(String str) {
		System.out.println("Input String = "+str);
		String word="";
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			int asciiValue=ch;
			if(asciiValue>=65 && asciiValue<=90) {//Capital letter range of ASCII 65 to 90
				asciiValue=asciiValue+32;
				ch=(char)asciiValue;
				word+=ch;
			}	
			else if(asciiValue>=97 && asciiValue<=122)//Small letter range of ASCII 97 to 122
				word+=ch;
		}
		System.out.println("Expected String = "+word);
	}
	public static void main(String[] args) {
		ConversionUsingASCII conversionUsingASCII = new ConversionUsingASCII();
		String input = "TecHnoCreDitS";
		conversionUsingASCII.stringConvertUsingASCII(input);
	}
}
