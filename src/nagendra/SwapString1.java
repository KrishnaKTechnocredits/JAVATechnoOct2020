package nagendra;
import java.util.Scanner;

/*
swap 2 String without using 3rd variable
Hint : use SubString method of String class
*/

public class SwapString1 {
	
	void swapString(String first,String second){
       first=first+second;
       second=first.substring(0, first.length() - second.length());
       first=first.substring(second.length() ,first.length());
       System.out.println(" String After Swapping");
		System.out.println("First String is:  "+first);
		System.out.println("Second String is: "+second);
	}

	public static void main(String[] args) {
		
		SwapString1  test=new  SwapString1();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter First String :");
		String first=scanner.next();
		System.out.println("Enter Second String :");
		String second=scanner.next();
		test.swapString(first, second);		
		scanner.close();
	}
}
