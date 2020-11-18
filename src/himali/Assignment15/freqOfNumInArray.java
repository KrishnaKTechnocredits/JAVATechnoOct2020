package himali.Assignment15;

import java.util.Scanner;

public class freqOfNumInArray {
	void checkFreqNumInArray(int[] num,int uNum) {
		int count=0;
		boolean b=false;
		for(int i=0;i<num.length;i++) {
			if(num[i]==uNum) {
				count++;
				b=true;
			}
		}
		if(b==false) 
			System.out.println("Given number"+uNum+ " is not present in predefined array.");
	
		else
			System.out.println("Given number"+uNum+" is present in predefined array with frequency"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		freqOfNumInArray freq=new freqOfNumInArray();
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number : ");
		int userNum=sc.nextInt();
		freq.checkFreqNumInArray(arr,userNum);
		
		

	}

}
