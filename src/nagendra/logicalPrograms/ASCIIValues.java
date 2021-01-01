package nagendra.logicalPrograms;

/*
 Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98
*/

public class ASCIIValues {

	void getAsciiValue(char input) {
		int value = input;
		System.out.println("The ASCII Value is:" + value);
	}

	void getCharacterValue(int ascii) {
		char output = (char) ascii;
		System.out.println(output);
	}

	void getAlphabetAsciiValue() {
		for (int i = 65; i <= 90; i++) {
			char output = (char) i;
			System.out.println("" + output + " ->" + i);

		}
	}

	void getLowerAlphabetAsciiValue() {
		for (int i = 97; i <= 122; i++) {
			char output = (char) i;
			System.out.println("" + output + " ->" + i);
		}
	}

	public static void main(String[] args) {

		ASCIIValues object = new ASCIIValues();
		char ch = '@';
		object.getAsciiValue(ch);
		int ascii = 67;
		object.getCharacterValue(ascii);
		object.getAlphabetAsciiValue();
		object.getLowerAlphabetAsciiValue();
	}
}
