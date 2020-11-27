package nagendra;
import java.util.Scanner;
/*
swap 2 String with using 3rd variable
*/
public class SwapString {
	
	String temp="";
	
	void swapString(String first,String second){
		temp=first;
		first=second;
		second=temp;
		System.out.println("After Swapping ");
		System.out.println("First String is:  "+first);
		System.out.println("Second String is: "+second);
	}

	public static void main(String[] args) {
		SwapString  test=new  SwapString();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter First String :");
		String first=scanner.next();
		System.out.println("Enter Second String :");
		String second=scanner.next();
		test.swapString(first, second);		
		scanner.close();
	}
}
