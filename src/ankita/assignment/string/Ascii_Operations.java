/*Program 3: write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z].
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98
*/
package ankita.assignment.string;

public class Ascii_Operations {
	void getCharAscii(char ch) {
		System.out.println("ASCII of " + ch + " is " + (int) ch);
	}

	void getChar(int ascii) {
		System.out.println("Character of ASCII value " + ascii + " is " + (char) ascii);
	}

	void getAsciiAToZ() {
		System.out.println("==ASCII Value - A to Z==");
		int num = 0;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			num = ch;
			System.out.println(ch + "-> " + num);
		}
	}

	void getAsciiaToz() {
		System.out.println("==ASCII Value - a to z==");
		int num = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			num = ch;
			System.out.println(ch + "-> " + num);
		}
	}

	public static void main(String[] args) {
		Ascii_Operations ascii_Operations = new Ascii_Operations();
		ascii_Operations.getCharAscii('c');
		ascii_Operations.getCharAscii('z');
		ascii_Operations.getCharAscii('t');
		ascii_Operations.getCharAscii('R');
		ascii_Operations.getCharAscii('U');
		ascii_Operations.getCharAscii('E');

		ascii_Operations.getChar(70);
		ascii_Operations.getChar(122);
		ascii_Operations.getChar(98);
		ascii_Operations.getChar(88);

		ascii_Operations.getAsciiAToZ();
		ascii_Operations.getAsciiaToz();
	}
}