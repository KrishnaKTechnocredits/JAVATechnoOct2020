package raghvendra.StringArrays;
/*Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98*/
public class AsciiOperations {
	int returnAscii(char ch){
		int temp=(char)ch;
		return temp;
	}
	char returnChar(int temp) {
		char ch=(char)temp;
		return ch;
	}
	void printUpperCase() {
		System.out.println("Uppercase Characters from A-Z are: ");
		for(char ch='A';ch<='Z';ch++) {
			int temp=ch;
			System.out.print(ch+"->"+temp+" ");
		}
		System.out.println();
	}
	void printLowerCase() {
		System.out.println("Lower Characters from A-Z are: ");
		for(char ch='a';ch<='z';ch++) {
			int temp=ch;
			System.out.print(ch+"->"+temp+" ");
		}
	}
	public static void main(String[] args) {
		AsciiOperations asciiOperations=new AsciiOperations();
		char ch='?';
		System.out.println("ASCII vlaue of character "+ch+" is "+asciiOperations.returnAscii(ch)); 
		int temp=123;
		System.out.println("Character vlaue of ASCII "+temp+" is "+asciiOperations.returnChar(123)); 
		asciiOperations.printUpperCase();
		asciiOperations.printLowerCase();
	}
}
