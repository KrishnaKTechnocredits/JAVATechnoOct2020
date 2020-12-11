package prasad;
import java.util.Scanner;
/*Program 3: write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z].
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98*/

public class ReturnASCII {
	
	void getChar(int num) {
		char ch = (char)num;
		System.out.println("Character: " + ch);
	}
	
	void getValue(String chr) {
		char ch= chr.charAt(0);
		int num = ch;
		System.out.println("ASCII value: " + num);
	}
	
	void printUpperCase() {
		 System.out.println("Printing ASCII values for characters [A-Z]");
		for(int index=65;index<=90;index++) {
			char ch = (char)index;
			System.out.println(ch + " : "+index);
		}
	}
	
	void printLowerCase() {
		System.out.println("Printing ASCII values for characters [a-z]");
		for(int index=97;index<=122;index++) {
			char ch = (char)index;
			System.out.println(ch + " : "+index);
		}
	}

	public static void main(String[]arg) {
		ReturnASCII returnASCII = new ReturnASCII();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any number(ASCII) to get corresponding Char.");
		int number = scanner.nextInt();
		returnASCII.getChar(number);
		System.out.println("Please enter any char to get its corresponding ASCII value.");
		String ch = scanner.next();
		returnASCII.getValue(ch);
		System.out.println(" ");
		returnASCII.printUpperCase();
		System.out.println(" ");
		returnASCII.printLowerCase();		
	}
}
