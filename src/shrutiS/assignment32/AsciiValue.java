/*Assignment  32: 3rd Dec EOD
Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
   A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
   a -> 97, b -> 98*/

package shrutiS.assignment32;

public class AsciiValue {
	
	int returnAsciiOfCharacter(char ch) {
			int temp = ch;
			//System.out.println(ch+" ASCII---> "+temp);
			return temp;
		}
		
	char returnCharacterOfAscii(int ascii) {
			char temp = (char) ascii;
			//System.out.println(ascii+" Char---> "+temp);
			return temp;
		}
		
	
	void printAsciiOfUppercaseLetters() {
		for ( char i ='A'; i<='Z'; i++) {
			int temp = i;
			System.out.println(i+" ASCII---> "+temp);
		}
		
	}
	
	void printAsciiOfLowercaseLetters() {
		for ( char i ='a'; i<='z'; i++) {
			int temp = i;
			System.out.println(i+" ASCII---> "+temp);
		}
	}
	
	public static void main(String[] args) {
		AsciiValue asciivalue = new AsciiValue();
		int ascii = asciivalue.returnAsciiOfCharacter('A');
		System.out.println("A ASCII---> "+ascii);
		System.out.println("***************************************************************");
		char ch = asciivalue.returnCharacterOfAscii(90);
		System.out.println("90 Char---> "+ch);
		System.out.println("*************************ASCII A_Z**************************************");
		asciivalue.printAsciiOfUppercaseLetters();
		System.out.println("\n*************************ASCII a_z**************************************");
		asciivalue.printAsciiOfLowercaseLetters();
	}

}
