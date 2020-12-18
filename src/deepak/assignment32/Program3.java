/*Program 3:  write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98
 */

package deepak.assignment32;

public class Program3 {
	
	int ascii(char ch) {
		int x = ch;
		return x;
	}
	
	char character(int a) {
		char ch = (char) a;
		return ch;
	}
	
	void printAllACSIIForUpperCase() {
		System.out.println("Printing UpperCase ASCII Values");
		for(char ch='A'; ch <='Z'; ch++) {
			int x = ch;
			System.out.print(ch +":"+ x + "," );
		}
	}
	
	void printAllASCIIforLOwerCase() {
		System.out.println("Printing LOwerCase ASCII Values");
		for(char ch='a'; ch<='z'; ch++) {
			int x=ch;
			System.out.print(ch +":"+ x + "," );
		}
	}
	
	public static void main(String[] args) {
		
		Program3 refVar = new Program3();
		System.out.println("ASCII value of Entered Character :"+" "+ refVar.ascii('*'));
		System.out.println("Character for Entered ASCII :"+" "+ refVar.character(122));
		
		refVar.printAllACSIIForUpperCase();
		
		refVar.printAllASCIIforLOwerCase();
	}

}
