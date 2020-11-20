package surbhi;
/*
write a single program having different methods.
 
a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.

*/
public class ArrayAssignment {

	static int minNumber(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}

		return minValue;
	}

	static int maxNumber(int[] inputArray) {

		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	static double average(int a[], int arr[]) {

		// Find sum of array element
		int sum = 0;
		// int n= arr.lenght;

		for (int i = 0; i < arr.length; i++)
			sum += a[i];

		return (double) sum / arr.length;
	}

	void display(int arr[]) {
		System.out.println("DIspaly the no");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	void displayReverse(int arr[]) {
		System.out.println("DIspaly the no in reverse order");
		for (int i = arr.length - 1; i >= 0; i--) {
           System.out.println(arr[i] + " ");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 12, 13, 14, 15, 16 };
		System.out.println(minNumber(arr));
		System.out.println(maxNumber(arr));
		System.out.println(average(arr, arr));
		ArrayAssignment arrayAssignment = new ArrayAssignment();
		arrayAssignment.display(arr);
		arrayAssignment.displayReverse(arr);

	}
}
