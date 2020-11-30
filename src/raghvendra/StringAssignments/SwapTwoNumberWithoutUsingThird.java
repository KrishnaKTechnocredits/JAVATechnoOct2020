package raghvendra.StringAssignments;
//swap 2 numbers without using 3rd variable
import java.util.Scanner;
public class SwapTwoNumberWithoutUsingThird {
	void swapNumber(int number1,int number2) {
		System.out.println("Number 1:"+((number1+number2)-number1));
		System.out.println("Number 2:"+((number1+number2)-number2));
	}

	public static void main(String[] args) {
		SwapTwoNumberWithoutUsingThird swapTwoNumberUsingThird=new SwapTwoNumberWithoutUsingThird();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int number1=sc.nextInt();
		System.out.println("Enter Number 2:");
		int number2=sc.nextInt();
		swapTwoNumberUsingThird.swapNumber(number1, number2);
	}
}
