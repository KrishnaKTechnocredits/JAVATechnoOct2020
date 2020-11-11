package ankit;

public class SimpleCalculation {
	int index = 0;

	int minimumNumber(int[] arr) {
		int minimum = arr[0];
		for (index = 0; index < arr.length; index++) {
			if (minimum > arr[index])
				minimum = arr[index];
		}
		System.out.println("From the list of array provided by client, minimum number is : " +minimum);
		return minimum;
	}

	int maxiumNumber(int[] arr) {
		int maximum = arr[0];
		for (index = 0; index < arr.length; index++) {
			if (maximum < arr[index])
				maximum = arr[index];
		}
		System.out.println("From the list of array provided by client, maximum number is : " +maximum);
		return maximum;		
	}

	int avgerageCalculation(int[] arr) {
		int avg = 0;
		int sum = 0;
		int counter = 0;
		for (index = 0; index < arr.length; index++) {
			sum += arr[index];
			counter++;
		}
		avg = sum / counter;
		System.out.println("Average of the list of array provided is : " +avg);
		return avg;
	}

	void displayStraight(int[] arr) {
		for(index=0; index<arr.length; index++) {
			System.out.print(arr[index]+ " ");
		}
		System.out.println();
	}

	void displayReverse(int[] arr) {
		for(index=(arr.length-1); index>=0; index--) {
			System.out.print(arr[index]+ " ");
		}
		System.out.println();
	}
	
	void averageOfMinAndMaxNumbers(int min, int max) {
		int averageMinMax =0;
		averageMinMax = (min + max)/2;
		System.out.println("Average of the minimum and maximum number calculated  from the array list is : " +averageMinMax);
	}
	public static void main(String[] args) {
		SimpleCalculation simpleCalculation = new SimpleCalculation();
		int arr[] = new int[] { 55, 45, 10, 60, 50 };
		int min = simpleCalculation.minimumNumber(arr);
		int max = simpleCalculation.maxiumNumber(arr);
		int avg = simpleCalculation.avgerageCalculation(arr);
		simpleCalculation.displayStraight(arr);
		simpleCalculation.displayReverse(arr);
		simpleCalculation.averageOfMinAndMaxNumbers(min, max);

	}

}
