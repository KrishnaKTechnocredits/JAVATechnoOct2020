package anjaliS;

public class SumOfMaxNumbers {
	void sumOfNum(int arr[]) {
		int first = 0, second = 0, third = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third)
				third = arr[i];
		}
		System.out.println("Top three number is-> " + first + "," + second + " and " + third);
		int sum = first + second + third;
		System.out.println("Sum of number = " + sum);
	}

	public static void main(String[] args) {
		int array[] = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		SumOfMaxNumbers sumofmaxnumbers = new SumOfMaxNumbers();
		sumofmaxnumbers.sumOfNum(array);
	}

}
