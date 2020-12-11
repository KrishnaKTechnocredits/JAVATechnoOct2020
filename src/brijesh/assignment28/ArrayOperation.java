package brijesh.assignment28;
import java.util.Arrays;

/*
find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60
*/

public class ArrayOperation {
	void findTripletWithMaximumSum(int[] input) {
		System.out.println("Given Array: "+Arrays.toString(input)+"\nLength of Array: "+input.length);
		int max=0,maxIndex=0;
		for(int index=0; index<input.length; index=index+3) {
			int sum=0;
			for(int innerIndex=index; innerIndex<index+3;innerIndex++) {
				if(innerIndex<input.length)
					sum+=input[innerIndex];
			}
			if(sum>max) {
				max=sum;
				maxIndex=index;
			}
		}
		printTriplet(input, max, maxIndex);
	}

	void printTriplet(int[] input, int max, int maxIndex) {
		System.out.print("Maximum Sum "+max+" of triplet: ");
		for(int index=maxIndex; index<maxIndex+3;index++)
			if(index<input.length)
				System.out.print(input[index]+" ");
		System.out.println("\n******************************************************************* ");
	}
	
	public static void main(String[] args) {
		int[] input1= {10,12,8,20,18,22,15,13,17,10};
		int[] input2= {10,12,8,20,18,22,15,50};
		int[] input3= {0,100,20,30,80,60,7,90,56,18,12,89};
		int[] input4= {20,10};
		int[] input5= {20,10,50,80,10,5};
		ArrayOperation arrayOperation= new ArrayOperation();
		arrayOperation.findTripletWithMaximumSum(input1);
		arrayOperation.findTripletWithMaximumSum(input2);
		arrayOperation.findTripletWithMaximumSum(input3);
		arrayOperation.findTripletWithMaximumSum(input4);
		arrayOperation.findTripletWithMaximumSum(input5);
	}
}
