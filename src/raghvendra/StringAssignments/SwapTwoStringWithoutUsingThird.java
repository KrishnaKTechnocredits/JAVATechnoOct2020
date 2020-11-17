package raghvendra.StringAssignments;
/*swap 2 String without using 3rd variable
Hint : use SubString method of String class*/
import java.util.Scanner;
public class SwapTwoStringWithoutUsingThird {
	void SwapString(String first,String second,int length1,int length2) {
		first+=second;
		System.out.println("First String: "+first.substring(length1));
		System.out.println("Second String: "+first.substring(0,length1));

	}

	public static void main(String[] args) {
		SwapTwoStringWithoutUsingThird swapTwoStringUsingThird=new SwapTwoStringWithoutUsingThird();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1:");
		String first=sc.next();
		int length1=first.length();
		System.out.println("Enter String 2:");
		String second=sc.next();
		int length2=second.length();
		swapTwoStringUsingThird.SwapString(first, second,length1,length2);
	}
}