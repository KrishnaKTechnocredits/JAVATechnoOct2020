package sadhana;

/*Assignment - 29 : 26th Nov'2020 
Find second maximum from array without sorting the array. */

public class SecondMaximum {
	void printData(int arr[]) {
		int largest = arr[0];
		int secondLargest = arr[0];
		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		}

		System.out.println("\nSecond largest number is:" + secondLargest);

	}

	public static void main(String[] args) {
		SecondMaximum secondMaximum = new SecondMaximum();
		int arr1[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		secondMaximum.printData(arr1);

	}
}