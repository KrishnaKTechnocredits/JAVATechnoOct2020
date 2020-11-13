package raghvendra;
/*Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.*/

import java.util.Scanner;
public class FindNumberInArray {
	void findNumber(int[] rr, int num) {
		int count=0;
		for (int index=0;index<rr.length;index++) {
			if(rr[index]==num)
					count++;
		}
		if(count>0)
			System.out.println("Character "+num+" occured "+count+" times");
		else
			System.out.println("Given number "+num+" is not present in predefined array");
	}

		public static void main(String[] args) {
			FindNumberInArray findNumberInArray=new FindNumberInArray();
			System.out.println("Enter How many numbers you want to enter:");
			Scanner sc=new Scanner(System.in);
			int length=sc.nextInt();
			int[] arr=new int[length];
			System.out.println("Enter numbers:");
			for(int index=0;index<length;index++) {
				arr[index]=sc.nextInt();
			}
			System.out.println("Enter number you want to find:");
			int number=sc.nextInt();
			findNumberInArray.findNumber(arr,number);
		}

}
