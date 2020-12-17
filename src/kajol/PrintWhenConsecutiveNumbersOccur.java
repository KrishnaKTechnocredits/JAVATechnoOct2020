/*Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi*/

package kajol;

import java.util.Arrays;
public class PrintWhenConsecutiveNumbersOccur {
	
	void findConsecutiveNumberAndPrint(int[] inputArray) {
		for(int index=0;index<inputArray.length-2;index++) {
			if(inputArray[index+1]==inputArray[index]+1 && inputArray[index+2]==inputArray[index+1]+1)
				System.out.println(inputArray[index]+","+inputArray[index+1]+","+inputArray[index+2]+" -> Hi");
		}		
	}
	
	public static void main(String[]args) {
		int inputArray[]= {1,2,3,5,8,9,11,12,13,14,15,18,19,20};
		System.out.println("Given Array is: "+Arrays.toString(inputArray));
		System.out.println("Consecutive Numbers in given Array are:");
		new PrintWhenConsecutiveNumbersOccur().findConsecutiveNumberAndPrint(inputArray);	
	}
}
