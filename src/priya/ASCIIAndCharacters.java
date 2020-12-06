//Program 3:  write a program having below methods.
//1) write a method which take one character and return its ascii value.
//2) write a method which take one ascii and return character.
//3) write a method to print ascii values for uppercase letters [A-Z]. ///A -> 65, B - 66....
//4) write a method to print ascii values for lowercase letter [a-z].///a -> 97, b -> 98

package priya;

public class ASCIIAndCharacters {

	int asciiValue(char ch1) {
		int ascii = ch1;
		return ascii;
	}

	char characterValue(int asciiValue) {
		char ch;
		ch =(char)asciiValue;	
		return ch;
	}

	void upperCaseAsciiValues() {
		char c;  
	      for(int i=65;i<=90;i++) //Loop for printing A to Z character
	      {
	         c =(char)i; //Converting ASCII value to Character
	         System.out.println(i+"  =  "+c); 
	      }
	}

	void lowerCaseAsciiValues() {
		char c1;  
	      for(int i=97;i<=122;i++) //Loop for printing a to z character
	      {
	         c1 =(char)i; //Converting ASCII value to Character
	         System.out.println(i+"  =  "+c1); 
	      }
	}

	public static void main(String args[]) {
		char ch = 'a';
		ASCIIAndCharacters stringprog10 = new ASCIIAndCharacters();
		int asciiValue = stringprog10.asciiValue(ch);
		System.out.println("The Ascii Value of "+ ch + " " + "is " + asciiValue);
		int asciiCode = 65;
		char Char = stringprog10.characterValue(asciiCode);
		System.out.println("Character corresponding to Ascii Value "+ asciiCode + " " + "is " + Char);
		stringprog10.upperCaseAsciiValues();
		stringprog10.lowerCaseAsciiValues();
	}
	
}
