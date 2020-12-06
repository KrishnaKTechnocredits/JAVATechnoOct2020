package rohan;

import java.util.Scanner;

/*
 * Program 3 :  [ Optional ]
    You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40 */
public class SumOfEvenNoInArray {
	void evenNoSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0)
				sum += arr[i];
		}
		System.out.println("Sum of even numbers is: "+sum);
	}
	
	public static void main(String[] args) {
		SumOfEvenNoInArray sumOfEvenNoInArray=new SumOfEvenNoInArray();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the lenght of integer array:");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the numbers into array: ");
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		sumOfEvenNoInArray.evenNoSum(arr);
		sc.close();
	}
}
