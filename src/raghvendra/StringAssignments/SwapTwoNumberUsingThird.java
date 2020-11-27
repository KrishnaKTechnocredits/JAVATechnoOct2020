package raghvendra.StringAssignments;
/*Program : 1 
swap 2 numbers with using 3rd variable*/
import java.util.Scanner;
public class SwapTwoNumberUsingThird {
	void swapNumber(int number1,int number2) {
		int temp=0;
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("Number 1:"+number1);
		System.out.println("Number 2:"+number2);
	}

	public static void main(String[] args) {
		SwapTwoNumberUsingThird swapTwoNumberUsingThird=new SwapTwoNumberUsingThird();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int number1=sc.nextInt();
		System.out.println("Enter Number 2:");
		int number2=sc.nextInt();
		swapTwoNumberUsingThird.swapNumber(number1, number2);
	}
}
