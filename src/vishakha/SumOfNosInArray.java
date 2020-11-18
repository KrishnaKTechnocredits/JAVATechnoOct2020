/*  You need to store user input in array and do sum of even numbers only from created 
     array. [ideal Expected Time : 10 mins, Max Time : 15 mins]

     Example :
     Input : {10,5,7,3,1,5,9,30}
     Output: 40*/

package vishakha;

import java.util.Scanner;

public class SumOfNosInArray {
	static int sum;
	
	static void calSumOfEvenNos(int[] num){
		for(int index=0; index<num.length; index++){
			if(num[index]%2 == 0){
				sum += num[index];
			}
		}
		System.out.println("Sum of even numbers from the array is "+sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to enter ?");
		int arrLength = scanner.nextInt();
		int [] num = new int [arrLength];
		for(int index=0; index<arrLength; index++){
			System.out.println("Enter "+ (index+1) + " number ");
			num[index] = scanner.nextInt();
		}
		SumOfNosInArray.calSumOfEvenNos(num);
	}
}
