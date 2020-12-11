package prem.assignment31;

/*Assignment 31 :  2nd Dec 2020
Program 1: 
Convert UpperCase into a LowerCase using ASCII 
Given String = "TechnoCreditS"
Expected String = "technocredits"
*/

public class AsciiAssignment {
	
	void asciiLowerCaseToUpperCase(String str){
		String newString = "";
		System.out.println("Given String is : " + str);
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 65 && ch <=90) 
				newString+=(char)(ch+32);
				else
					newString+=ch;
		}		
		System.out.println(newString);
	}
	
	public static void main(String[] args) {
		AsciiAssignment asciiAssignment = new AsciiAssignment();
		asciiAssignment.asciiLowerCaseToUpperCase("TechnoCreditS");
	}
}
