package brijesh.assignment12;

public class ArrayOperations {
	
	int findMinNumber(int[] input) {
		int min=input[0];
		//For optimization, started for loop from 1 because we have already assigned 0th value in min
		for(int i=1; i<input.length;i++)
		{
			if(input[i]<min)
				min=input[i];
		}
		return min;
	}
	
	int findMaxNumber(int[] input) {
		int max=input[0];
		//For optimization, started for loop from 1 because we have already assigned 0th value in min
		for(int i=1; i<input.length;i++)
		{
			if(input[i]>max)
				max=input[i];
		}
		return max;
	}
	
	int calculateAverage(int[] input) {
		int sum=0;
		for(int i=1; i<input.length;i++)
			sum+=input[i];
		return sum/input.length;
	}
	
	void displayNumbers(int[] input) {
		System.out.println("************** Print array************");
		for(int i=0; i<input.length;i++)
			System.out.print(input[i]+" ");
		System.out.println();
	}
	
	void displayNumbersInReverse(int[] input) {
		System.out.println("************* Print array in reverse **************");
		for(int i=input.length-1; i>=0;i--)
			System.out.print(input[i]+" ");
		System.out.println();
	}
	
	int calculateAverageMinMax(int[] input) {
		return (findMinNumber(input)+findMaxNumber(input))/2;
	}

	public static void main(String[] args) {
		ArrayOperations arrayOperations = new ArrayOperations();
		int inputArray[] = {10,58,-89,-20,45,68,22,99};
		arrayOperations.displayNumbers(inputArray);
		arrayOperations.displayNumbersInReverse(inputArray);
		System.out.println("Minimum number is: "+arrayOperations.findMinNumber(inputArray));
		System.out.println("Maximum number is: "+arrayOperations.findMaxNumber(inputArray));
		System.out.println("Average of all numbers: "+arrayOperations.calculateAverage(inputArray));
		System.out.println("Average of Min and Max numbers: "+arrayOperations.calculateAverageMinMax(inputArray));
	}

}
