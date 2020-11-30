package shrutiC;

public class NumericOperations {

	void displayArray(int[] numberArray) {
		System.out.print("Array : ");
		for (int index = 0; index < numberArray.length; index++)
			System.out.print(numberArray[index] + " ");
	}

	void displayReverseArray(int[] numberArray) {
		System.out.print("\nReverse Array : ");
		for (int index = numberArray.length - 1; index >= 0; index--)
			System.out.print(numberArray[index] + " ");

	}

	int findMaximumNum(int[] numberArray) {

		int maxNum = numberArray[0];
		for (int index = 0; index < numberArray.length; index++) {
			if (numberArray[index] > maxNum) {
				maxNum = numberArray[index];
			}
		}

		return maxNum;

	}

	int findMinimumNum(int[] numberArray) {

		int minNum = numberArray[0];
		for (int index = 0; index < numberArray.length; index++) {
			if (minNum > numberArray[index]) {
				minNum = numberArray[index];
			}
		}

		return minNum;
	}

	int findAverage(int[] numberArray) {

		int sum = 0;
		int avg = 0;
		for (int index = 0; index < numberArray.length; index++)
			sum += numberArray[index];

		avg = sum / numberArray.length;
		System.out.println("Average of all numbers in an array is : " + avg);
		return avg;

	}

	void findAverageOfMinMaxNum(int[] numberArray) {
		int avg = 0;
		int minNum, maxNum;
		maxNum = findMaximumNum(numberArray);
		minNum = findMinimumNum(numberArray);
		avg = (maxNum + minNum) / 2;
		System.out.println("Average of min and max number in an array is : " + avg);
	}

	public static void main(String[] args) {
		NumericOperations array = new NumericOperations();
		int input[] = { 5, 45, 100, -10 };
		array.displayArray(input);
		array.displayReverseArray(input);

		int minNum = array.findMinimumNum(input);
		System.out.println("\nMininum number in an array is : " + minNum);

		int maxNum = array.findMaximumNum(input);
		System.out.println("Maximum number in an array is : " + maxNum);

		array.findAverage(input);
		array.findAverageOfMinMaxNum(input);
	}

}
