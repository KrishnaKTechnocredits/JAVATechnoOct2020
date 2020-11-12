package himali.Assignment15;

import java.util.Scanner;

public class sumOfEvenNumberInArray {
	
	void sunOfEvenNum(int[] num1) {
		int sum=0;
		for(int i=0;i<num1.length;i++) {
			if(num1[i]%2==0) {
				sum=sum+num1[i];
			}
		}
		System.out.println("The  sum of even number is :"+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfEvenNumberInArray sumEven =new sumOfEvenNumberInArray();
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		System.out.println("Enter the elements : ");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		sumEven.sunOfEvenNum(num);

	}

}
