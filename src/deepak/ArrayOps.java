package deepak;

public class ArrayOps {
	
	int findMinNumber(int[] input) {
		int min=input[0];
		
		for(int i=1; i<input.length;i++)
		{
			if(input[i]<min)
				min=input[i];
		}
		return min;
	}
	
	int findMaxNumber(int[] input) {
		
		int max = input[0];
		
		for(int index=1; index < input.length; index++) {
			
			if(input[index] > max)
				max = input[index];
		}
		return max;
	}
	
	int calculateAverage(int[] input) {
		int sum=0;
		
		for(int index=0; index < input.length; index++) {
			
			sum = sum + input[index];
		}
		
		return sum/input.length;
		
	}
	
	void displayNumbersInArray(int[] input) {
		
		for(int index=0; index < input.length; index++) {	
			System.out.println(input[index]);
		}
	}
	
	void displayInReverse(int[] input) {
		System.out.println("Displaying numbers in reverse order");
		
		for(int index=input.length-1; index >= 0; index--) {
			
			System.out.println(input[index]);
		}
	}
	
	int calculateAvgMinAndMax(int[] input){
		int sum=0;
		sum = (findMinNumber(input)+findMaxNumber(input));
		return sum/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayOps arrayOps = new ArrayOps();
		
		int[] arr = {10, 58, 63, 41, 74, 6, 7};
		
		System.out.println("Minimum number in a give array is :"+ arrayOps.findMinNumber(arr));
		System.out.println("Maximum number in a given array is :"+ arrayOps.findMaxNumber(arr) );
		System.out.println("Average of given array is :"+ arrayOps.calculateAverage(arr));
		arrayOps.displayNumbersInArray(arr);
		arrayOps.displayInReverse(arr);
		System.out.println("Calculate avg of Min and Max number in given array: "+ arrayOps.calculateAvgMinAndMax(arr));
	}

}
