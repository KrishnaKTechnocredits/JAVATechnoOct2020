package raghvendra;
/*  You need to store user input in array and do sum of even numbers only from created 
array. [ideal Expected Time : 10 mins, Max Time : 15 mins]*/
import java.util.Scanner;
public class ArraySumEvenNumber {
	void findNumber(int[] rr) {
		int sum=0;
		for (int index=0;index<rr.length;index++) {
			if(rr[index]%2==0)
					sum=sum+rr[index];
		}
			System.out.println("Sum of even numbers are: "+sum);
	}

		public static void main(String[] args) {
			ArraySumEvenNumber arraySumEvenNumber=new ArraySumEvenNumber();
			System.out.println("Enter How many numbers you want to enter:");
			Scanner sc=new Scanner(System.in);
			int length=sc.nextInt();
			int[] arr=new int[length];
			System.out.println("Enter numbers:");
			for(int index=0;index<length;index++) {
				arr[index]=sc.nextInt();
			}
			arraySumEvenNumber.findNumber(arr);
		}

}
