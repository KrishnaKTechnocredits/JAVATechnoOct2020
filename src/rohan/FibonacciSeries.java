package rohan;

/*
Print Fibonacci series for first 10 numbers.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number until which Fibonacci series should be printed: ");
		int range = sc.nextInt();
		printFibonacciSeries(range);
		sc.close();
	}
	
	static void printFibonacciSeries(int range) {
		int cnt=0,num=0,sum=0;
		int[] arr = new int[range];
		arr[0]=0;arr[1]=1;
		for(int index=2;index<arr.length;index++) {
			arr[index] = arr[index-2]+arr[index-1];
		}
		
		for(int index=0;index<arr.length;index++)
			System.out.print(arr[index]+" ");
		
		/*while(cnt<range) {
			sum += num;
			System.out.print(sum+",");
			cnt++;
			num++;
		}*/
	}
}
