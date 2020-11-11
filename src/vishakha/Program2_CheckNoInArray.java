/*Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.*/

package vishakha;

import java.util.Scanner;

public class Program2_CheckNoInArray {
	int count;
	
	void checkNumInArray(int[] num, int userNum){
		for(int index=0; index<num.length; index++){
			if(num[index] == userNum){
				//System.out.println("Given number "+userNum+ " is present in the array");
				count++;
			}
		}
		if(count>0)
			System.out.println("Number "+userNum+ " is present in the array "+count+ " times");
		else
			System.out.println("Number "+userNum+ " is not present in the array.");
	}

	public static void main(String[] args) {
		Program2_CheckNoInArray checkNoInArray = new Program2_CheckNoInArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to enter ?");
		int arrLength = scanner.nextInt();
		int [] num = new int [arrLength];
		for(int index=0; index<arrLength; index++){
			System.out.println("Enter "+ (index+1) + " number ");
			num[index] = scanner.nextInt();
		}
		System.out.println("Enter number to check the frequency ");
		int userNumber = scanner.nextInt();
		checkNoInArray.checkNumInArray(num, userNumber);
	}
}
