package tejashree;

class Assignment12 {

	public static void main(String args[]) {
		int array[] = new int[] { 11, 10, 8, 22, 12, 120 };
		int max = getMax(array);
		System.out.println("Maximum Value is: " + max);
		int min = getMin(array);
		System.out.println("Minimum Value is: " + min);
		new Assignment12().printElements(array);
		System.out.println();
		new Assignment12().printReverse(array);
		System.out.println();
		new Assignment12().finMinMaxAvg(array);
	}
	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

	void printReverse(int[] inputArray) {
		System.out.println("Array elements in reverse order are:");
		for (int i = inputArray.length - 1; i >= 0; i--) {
			System.out.print(inputArray[i] + " ");

		}
	}
	void printElements(int[] inputArray) {
		System.out.println("Array elements are:");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");

		}
	}
	void finMinMaxAvg(int[] inputArray) {
		int min = getMin(inputArray);
		int max = getMax(inputArray);
		double avg = (min + max) / 2;
		System.out.println("Avg of min value and max value is:" + avg);

	}
}