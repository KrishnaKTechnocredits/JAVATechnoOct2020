package anurag;

public class Array {

	int ar[] = { 10, 5, 30, 20, 90 };

	int displayMin() {

		int min = ar[0];

		for (int index = 0; index < 5; index++) {

			if (ar[index] < min)
				min = ar[index];
		}

		return min;

	}

	int displayMax() {

		int max = ar[0];

		for (int index = 0; index < 5; index++) {

			if (ar[index] > max)
				max = ar[index];
		}

		return max;

	}

	void displayAvg() {

		int sum = 0;
		double avg = 0;
		for (int index = 0; index < 5; index++) {
			sum = sum + ar[index];
			avg = sum / 5;
		}

		System.out.println("Average of all the numbers for the given array is : " + avg);
	}

	void displayNumbers() {

		System.out.println("All the numbers in the array are : ");

		for (int index = 0; index < ar.length; index++) {

			System.out.println(ar[index]);

		}

	}

	void displayArrayReverse() {

		System.out.println("Printing numbers in reverse order in the array are : ");

		for (int index = ar.length - 1; index >= 0; index--) {

			System.out.print(ar[index]);
			System.out.println(" ");

		}

	}

	void minMaxArray() {
		double avg;
		Array cal = new Array();
		double min = cal.displayMin();
		double max = cal.displayMax();
		System.out.println("Average of Min and Max number is below :");

		avg = (min + max) / 2;
		System.out.println(avg);

	}

	public static void main(String[] args) {

		Array array = new Array();
		double minimum = array.displayMin();
		System.out.println("Minimum number in the array :" + minimum);

		double maximum = array.displayMax();
		System.out.println("Maximum number in the array :" + maximum);
		array.displayAvg();
		array.displayNumbers();
		array.displayArrayReverse();
		array.minMaxArray();
	}

}