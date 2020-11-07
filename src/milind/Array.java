/*Assignment - 12 : 7th Oct'2020 
write a single program having different methods.
 
a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.*/

package milind;

public class Array {
	
	int minNumberFromArray(int[] array) {
		int minNumber = array[0];
		for(int index = 0; index < array.length; index++) {
			if(minNumber > array[index]) {
				minNumber = array[index];
			}
		}
		return minNumber;
	}
	
	int maxNumberFromArray(int[] array) {
		int maxNumber = array[0];
		for(int index = 0; index < array.length; index++) {
			if(maxNumber < array[index]) {
				maxNumber = array[index];
			}
		}
		return maxNumber;
	}
	
	double arrayAvg(int[] array) {
		int sum = 0;
		for(int index = 0; index < array.length; index++) {
			sum = sum + array[index];
		}
		double avg = sum / array.length;
		return avg;
	}
	
	void printArray(int[] array) {
		System.out.print("Array Printing : ");
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + ", ");
		}
		System.out.println("");
	}
	
	void printReverseArray(int[] array) {
		System.out.print("Reverse array printing : ");
		for(int index = array.length-1; index >= 0 ; index--) {
			System.out.print(array[index] + ", ");
		}
		System.out.println("");
	}
	
	double averageOfMinAndMax(int minNumberFromArray, int maxNumberFromArray) {
		double average = (minNumberFromArray + maxNumberFromArray) / 2;
		return average;
	}
	
	public static void main(String[] args) {
		
		int[] input = {25, -3, 50, 122, 78, 99, 130, 299, -6};
		Array array = new Array();
		int minimumNumber = array.minNumberFromArray(input);
		int maximumNumber = array.maxNumberFromArray(input);
		System.out.println("Minimum number from Array is : " + minimumNumber);
		System.out.println("Maximum number from Array is : " + maximumNumber);
		System.out.println("Average of Array is : " + array.arrayAvg(input));
		array.printArray(input);
		array.printReverseArray(input);
		System.out.println("Average of " + minimumNumber +" and " + maximumNumber +" is : " + array.averageOfMinAndMax(minimumNumber, maximumNumber));
	}
}
