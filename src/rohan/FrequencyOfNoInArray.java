package rohan;

import java.util.Scanner;

/*Program 2:  [ Optional ]
Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.*/

public class FrequencyOfNoInArray {
	
	void findNumberInArray(int[] numArray,int num) {
		int flag =0;
		for(int i=0;i<numArray.length;i++) {
			if(numArray[i] == num) {
				flag = 1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Given Number "+num+" is available in predefined array");
		else
			System.out.println("Given Number "+num+" is not available in predefined array");
	}
	public static void main(String[] args) {
		FrequencyOfNoInArray frequencyOfNoInArray = new FrequencyOfNoInArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of integer array");
		int len = sc.nextInt();
		int[] numArray = new int[len];
		System.out.println("Enter the numbers into integer array");
		for(int i=0;i<len;i++) {
			numArray[i] = sc.nextInt();
		}
		System.out.println("Enter the number to search in array");
		int num = sc.nextInt();
		frequencyOfNoInArray.findNumberInArray(numArray, num);
		sc.close();
	}

}
