package rohan;

import java.util.Scanner;

/*
 * Verify number is in Fibonacci series or not.
 */

public class VerifyFiboNo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to verify it is in Fibo series or not: ");
		int num = sc.nextInt();
		isNumberInFiboSeries(num);
		sc.close();
	}
	
	static void isNumberInFiboSeries(int num) {
		int len=num+10;
		boolean flag= false;
		int[] arr = new int[len]; 
		arr[0]=0;
		arr[1]=1;
		for(int index=2;index<arr.length;index++) {
			arr[index]=arr[index-2]+arr[index-1];
			if(arr[index]==num || arr[0]==num) {
				flag=true;
				break;
			}
			else if(arr[index]>num) {
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(num+" is part of Fibo series");
		else
			System.out.println(num+" is not part of Fibo series");
	}
}
