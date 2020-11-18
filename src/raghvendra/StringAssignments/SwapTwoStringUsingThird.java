package raghvendra.StringAssignments;
import java.util.Scanner;
//swap 2 String with using 3rd variable
public class SwapTwoStringUsingThird {
	void SwapString(String first,String second) {
		String third="";
		third=first;
		first=second;
		second=third;
		System.out.println("First String: "+first);
		System.out.println("Second String: "+second);

	}

	public static void main(String[] args) {
		SwapTwoStringUsingThird swapTwoStringUsingThird=new SwapTwoStringUsingThird();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1:");
		String first=sc.next();
		System.out.println("Enter String 2:");
		String second=sc.next();
		swapTwoStringUsingThird.SwapString(first, second);
	}
}