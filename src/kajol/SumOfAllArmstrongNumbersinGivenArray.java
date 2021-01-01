/*Assignment - 35 : 4th Dec'2020 

return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524*/

package kajol;

import java.util.Arrays;

public class SumOfAllArmstrongNumbersinGivenArray {
	
	void findSumofArmstrongNumbers(int [] inputArray) {
		System.out.println("Given Array is : "+Arrays.toString(inputArray));
		int armstrongSum=0;
		for(int index=0;index<inputArray.length;index++) {
			int tempNo=inputArray[index];
			int sum=0;
			int digit=0;
			while(inputArray[index]>0) {
				digit=inputArray[index]%10;
				inputArray[index]=inputArray[index]/10;
				sum+=(digit*digit*digit);
			}
			if(sum==tempNo)
				armstrongSum+=tempNo;	
		}
		System.out.println("Sum of Armstrong Numbers in Given array is: "+armstrongSum);
	}
	
	public static void main(String[] args) {
		int inputArray[]= {153, 111, 124, 371};
		new SumOfAllArmstrongNumbersinGivenArray().findSumofArmstrongNumbers(inputArray);
	}
}
