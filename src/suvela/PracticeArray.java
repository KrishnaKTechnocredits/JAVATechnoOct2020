package suvela;

public class PracticeArray {
	int min(int[] array) {
		int index=0;
		int min = array[index];
		for (index = 0; index < array.length; index++) {
			if (array[index] < min)
				min = array[index];
		}
		return min;

	}

	int max(int[] array) {
		int index=0;
		int max = array[index];
		for (index = 0; index < array.length; index++) {
			if (array[index] > max)
				max = array[index];
		}
		return max;
	}

	void display(int[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			System.out.println(numbers[index]);
		}
	}

	void reverse(int[] numbers) {
		for (int index = numbers.length - 1; index >= 0; index--) {
			System.out.println(numbers[index]);
		}
	}

	int average(int[] array) {
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum = sum + array[index];
		}
		return sum / array.length;
	}

	public static void main(String[] args) {
		int[] array = { 50, 10, 60, 40, 30 };
		PracticeArray a = new PracticeArray();
		System.out.println("Array in standard order:");
		a.display(array);
		System.out.println("Array in reverse order:");
		a.reverse(array);
		int avg = a.average(array);
		System.out.println("Average is :" + avg);
		int min = a.min(array);
		System.out.println("Minimum number is :" + min);
		int max = a.max(array);
		System.out.println("Maximum number is :" + max);
	}

}
