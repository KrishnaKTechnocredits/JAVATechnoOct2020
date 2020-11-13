package himali.Assignment15;

import java.util.Scanner;

public class IdentifyNumber {
	
	void indetifyNum(int[] arr) {
		int positiveCount=0;
		int negativeCount=0;
		int zeroCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				negativeCount++;
			
			}else if (arr[i]==0) {
				zeroCount++;
	
				
			}else {
				positiveCount++;
				
				
			}
		}
		System.out.println("zero numbers are "+zeroCount);
		System.out.println("Positive numbers are "+positiveCount);
		System.out.println("Negative numbers are "+negativeCount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdentifyNumber number=new IdentifyNumber();
		int arr[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		number.indetifyNum(arr);
		
	}

}
