package nandini.stringPrograms;

public class StringProg10 {
 
	int printAsciiValue(char ch1) {
		int ascii = ch1;
		return ascii;
	}
	
	char printCharacter(int asciiValue) {
		char ch;
		ch =(char)asciiValue;	
		return ch;
	}
	
	void printUpperCaseAsciiValues() {
		char c;  
	      for(int i=65;i<=90;i++) //Loop for printing A to Z character
	      {
	         c =(char)i; //Converting ASCII value to Character
	         System.out.println(i+"  =  "+c); 
	      }
	}
	
	void printLowerCaseAsciiValues() {
		char c1;  
	      for(int i=97;i<=122;i++) //Loop for printing a to z character
	      {
	         c1 =(char)i; //Converting ASCII value to Character
	         System.out.println(i+"  =  "+c1); 
	      }
	}
	
	public static void main(String args[]) {
		char ch = 'a';
		StringProg10 stringprog10 = new StringProg10();
		int asciiValue = stringprog10.printAsciiValue(ch);
		System.out.println("The Ascii Value of "+ ch + " " + "is " + asciiValue);
		int asciiCode = 65;
		char Char = stringprog10.printCharacter(asciiCode);
		System.out.println("Character corresponding to Ascii Value "+ asciiCode + " " + "is " + Char);
		stringprog10.printUpperCaseAsciiValues();
		stringprog10.printLowerCaseAsciiValues();
	}
}
