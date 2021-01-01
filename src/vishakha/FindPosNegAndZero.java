/*Create a class where user will provide int array. *[ideal Expected Time : 15 mins, Max 
    Time : 25 mins]*

    A) User can provide any positive and negative number
    B) You need to find out how many positive, negative numbers and zeros are there in array */

package vishakha;

import java.util.Scanner;

public class FindPosNegAndZero {
	int posCount;
	int negCount;
	int zeroCount;
	
	void findNoType(int[] num){
		for(int index=0; index<num.length; index++){
			if(num[index]>0)
				posCount++;
			else if(num[index]<0)
				negCount++;
			else
				zeroCount++;
		}
		displayNoType();
	}
	
	void displayNoType(){
		 if(posCount>0)
			 System.out.println("There are "+posCount+ " positive numbers in the array");
		 if(negCount>0)
			 System.out.println("There are "+negCount+ " negative numbers in the array");
		 if(zeroCount>0)
			 System.out.println("There are "+zeroCount+ " zeros in the array");
	}

	public static void main(String[] args) {
		FindPosNegAndZero findPosNegAndZero = new FindPosNegAndZero();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to enter ?");
		int arrLength = scanner.nextInt();
		int [] num = new int [arrLength];
		for(int index=0; index<arrLength; index++){
			System.out.println("Enter "+ (index+1) + " number ");
			num[index] = scanner.nextInt();
		}
		findPosNegAndZero.findNoType(num);
	}
}
