package rohan;

import java.util.Scanner;

/*Program 4 :  [ Optional ]
    Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
    Time : 25 mins]*

    A) User can provide any positive and negative number
    B) You need to find out how many positive, negative numbers and zeros are there in array */

public class PositiveNegativeNumInArray {
	int pCnt,nCnt,zCnt;
	
	void PosNegZerCount(int[] arr) {
		System.out.println("---------Output---------");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				pCnt++;
			else if(arr[i]<0)
				nCnt++;
			else
				zCnt++;
		}
		System.out.println("Count of Positive Numbers: "+pCnt);
		System.out.println("Count of Negative Numbers: "+nCnt);
		System.out.println("Count of Zeros: "+zCnt);
	}
	
	public static void main(String[] args) {
		PositiveNegativeNumInArray positiveNegativeNumInArray=new PositiveNegativeNumInArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Integer array:");
		int len = sc.nextInt();
		System.out.println("Enter the integers in array:");
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		positiveNegativeNumInArray.PosNegZerCount(arr);
		sc.close();
		
	}
}
