package ruby;
/*Assignment 32: 3rd Dec'2020 */
public class Assignment32Prog3 {
	
/*Program 3:  write a program having below methods.
 * 1) write a method which take one character and return its ascii value.*/
	int getAsciiForChar(char ch) {
		int num = ch;
		return num;
	}
/*2) write a method which take one ascii and return character.*/	
	char getCharForAscii(int num) {
		char ch = (char) num;
		return ch;
	}

/*	3) write a method to print ascii values for uppercase letters [A-Z]. 
	A -> 65, B - 66....*/
	void printUpperCaseLetter() {
		for(char ch='A'; ch<='Z';ch++) {
			int num= ch;
			System.out.println(ch+"->"+num);
		}
	}
/*	4) write a method to print ascii values for lowercase letter [a-z].
	a -> 97, b -> 98*/	
	void printLowerCaseLetter() {
		for(char ch='a'; ch<='z';ch++) {
			int num= ch;
			System.out.println(ch+"->"+num);
		}
	}
	

	public static void main(String[] args) {
		Assignment32Prog3 assign = new Assignment32Prog3();
		System.out.println("UpperCase letters from A to Z");	
		assign.printUpperCaseLetter();
		System.out.println("LowerCase letters from a to z");
		assign.printLowerCaseLetter();
		
		char c='d';
		int acsiiValue = assign.getAsciiForChar(c);
		System.out.println("ACSII Value for character '"+c+"' is "+acsiiValue);
		
		int n=68;
		char ch = assign.getCharForAscii(n);
		System.out.println("character for "+n+" ACSII value is "+ch);

	}

}
