package nitin.Assignment_32;
/* Assignment 32: 3rd Dec'2020 - Program 3: write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z].
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98*/
public class Program3 {
	public void returnAscii(char ch) {
		int asciiValue=ch;
		System.out.println("Character '"+ch+"' ASCII Value is "+asciiValue);
	}
	public void convertAsciiChar(int asciiValue) {
		char ch=(char)asciiValue;
		System.out.println(asciiValue+" is the ASCII Value of Character '"+ch+"'");
	}
	public void displayUpperCaseAscii() {
		int ch1=' ';
		for(char ch='A';ch<='Z';ch++) {
			ch1=ch;
			System.out.println("Upper Case ASCII Value of "+ch1+" is "+ch);
		}
	}
	public void displayLowerCaseAscii() {
		int ch2=' ';
		for(char ch='a';ch<='z';ch++) {
			ch2=ch;
			System.out.println("Lower Case ASCII Value of "+ch2+" is "+ch);
		}
	}
	public static void main(String[] args) {
		Program3 program3 = new Program3();
		program3.returnAscii('n');
		System.out.println("----------------------------------------");
		program3.convertAsciiChar(99);
		System.out.println("----------------------------------------");
		program3.displayUpperCaseAscii();
		System.out.println("----------------------------------------");
		program3.displayLowerCaseAscii();
		
	}
}
