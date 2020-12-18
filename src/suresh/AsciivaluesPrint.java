package suresh;
/*write a program having below methods.
1) write a method which take one character and return its ascii value.
2) write a method which take one ascii and return character.
3) write a method to print ascii values for uppercase letters [A-Z]. 
A -> 65, B - 66....
4) write a method to print ascii values for lowercase letter [a-z].
a -> 97, b -> 98
*/
public class AsciivaluesPrint {
	char c;
	int n;
	
	void printAsciiValue(char ch) {
		int asciiValue = ch;  
		System.out.println("ASCII value of " +ch+ " is: "+asciiValue); 
		
	}
	void printCharValue(int num) {
		System.out.println(" The ASCII value of " + (char)num + "  =  " + num);
	}
	
	void printUpperCaseLetters() {
	for(int i = 65; i <= 90; i++)  
	{
		System.out.println(" The ASCII value of Upper Case Letters " + (char)i + "  =  " + i);    
	}
	}
	
	void printLowerCaseLetters() {
		for(int i = 97; i <= 122; i++)  
		{
			System.out.println(" The ASCII value of Small Case Letters " + (char)i + "  =  " + i);    
		}
		
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsciivaluesPrint asciivaluesprint = new AsciivaluesPrint();
		System.out.println("<===================Printing ASCII Value================================>");
		asciivaluesprint.printAsciiValue('P');
		System.out.println("<===================Printing Charachter Value================================>");
		asciivaluesprint.printCharValue(65);
		
		System.out.println("<===================Printing Upper case Letters================================>");
		asciivaluesprint.printUpperCaseLetters();
		System.out.println("<===================Printing Lower case Letters================================>");
		asciivaluesprint.printLowerCaseLetters();
	}

}
