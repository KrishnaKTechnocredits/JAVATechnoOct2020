package anjaliP;
/*Assignment - 12 : 7th Oct'2020 
write a single program having different methods.
a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.*/

public class Array {
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
		int max=input[0];
		for(int i=1; i<input.length;i++)
		{
			if(input[i]>max)
				max=input[i];
		}
		return max;
	}
	int average(int[] input) {
		int sum=0;
		for(int i=1; i<input.length;i++)
			sum+=input[i];
		return sum/input.length;
	}
	void displayNumbers(int[] input) {
		System.out.print("Numbers in Forward direction ");
		for(int i=0; i<input.length;i++)
			System.out.print(input[i]+" ");
	}
	void displayNumbersInReverse(int[] input) {
		System.out.print("\n"+"Numbers in Backward direction ");
		for(int i=input.length-1; i>=0;i--)
			System.out.print(input[i]+" ");
	}
	int averageMinMax(int[] input) {
		return (findMinNumber(input)+findMaxNumber(input))/2;
	}
	public static void main(String[] args) {
		Array array = new Array();
		int inputArray[] = {10,20,30,50,100,250,9};
		array.displayNumbers(inputArray);
		array.displayNumbersInReverse(inputArray);
		System.out.println("\n"+"Min number is: "+array.findMinNumber(inputArray));
		System.out.println("Max number is: "+array.findMaxNumber(inputArray));
		System.out.println("Average of all numbers: "+array.average(inputArray));
		System.out.println("Average of Min and Max numbers: "+array.averageMinMax(inputArray));
	}
}
