/*
Assignment - 12 : 7th Oct'2020
write a single program having different methods.

a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.
*/

package ritika.Assignments;

public class ArrayOperations {

	int findMaxNumber(int num1[]) {
		int max = num1[0];
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] > max)
				max = num1[i];
		}
		System.out.println("Max Numeber is " + max);
		return max;
	}

	int findMinNumber(int num2[]) {
		int min = num2[0];
		for (int i = 0; i < num2.length; i++) {
			if (num2[i] < min)
				min = num2[i];
		}
		System.out.println("Min Numeber is " + min);
		return min;
	}

	int findAvgOfMinAndMaxNumber(int min, int max) {
		int avg = (min + max) / 2;
		System.out.println("Average of min and max is " + avg);
		return avg;
	}

	int findAvgOfAllNumbers(int num3[]) {
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < num3.length; i++) {
			sum += num3[i];
			avg = sum / num3.length;
		}
		System.out.println("Average of all numbers of the array is " + avg);
		return avg;
	}

	void displayNumberStartToEnd(int num4[]) {
		System.out.println("All numbers of Array from Start to End ");
		for (int i = 0; i < num4.length; i++) {
			System.out.println(num4[i]);
		}
	}

	void displayNumberEndToStart(int num5[]) {
		System.out.println("All numbers of Array from End to Start ");
		for (int i = num5.length - 1; i >= 0; i--) {
			System.out.println(num5[i]);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 10, 58, -13, 66, 95, -74 };
		ArrayOperations arrayOperations = new ArrayOperations();
		int maxNumber = arrayOperations.findMaxNumber(arr);
		int minNumber = arrayOperations.findMinNumber(arr);
		arrayOperations.findAvgOfMinAndMaxNumber(minNumber, maxNumber);
		arrayOperations.findAvgOfAllNumbers(arr);
		System.out.println("");
		arrayOperations.displayNumberStartToEnd(arr);
		System.out.println("");
		arrayOperations.displayNumberEndToStart(arr);
	}
}
