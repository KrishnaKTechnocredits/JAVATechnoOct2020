//Assignment-22 : 18th Nov'2020 
//Print all prime numbers between 2 to 100.
package priya;

import java.util.Scanner;

public class PrimeNumber {

	int[] primeNumberFromTwoToHundred(int num1, int num2) {
		System.out.println("Prime Numbers between : " + num1 +" & " +num2);
		int primeArray[] = new int[num2-num1]; 
		int count=1;
		for(int index=num1;index<=num2;index++) {
			boolean flag=true;
			for(int i=2;i<=index/2;i++) {
				if(index%i==0) {
					flag = false;
					break;
				}
			}
			if(flag) 
				primeArray[count++]=index;
		}
		return primeArray;
	}
	public static void main(String[] args) {
		int[] arr =  new PrimeNumber().primeNumberFromTwoToHundred(2,100);
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=0)
				System.out.print(arr[index]+ ", ");
			}
	}
	
}
