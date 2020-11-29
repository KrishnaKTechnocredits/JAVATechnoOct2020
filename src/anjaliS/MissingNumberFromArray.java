package anjaliS;

public class MissingNumberFromArray {
	void displayMissedNumber(int arr[], int n) {
		int sum;
		sum = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < n; i++)
			sum -= arr[i];
		System.out.println("Missing numbers in array is: " + sum);
	}

	public static void main(String[] args) {
		MissingNumberFromArray missingnumberfromarray = new MissingNumberFromArray();
		int array[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		missingnumberfromarray.displayMissedNumber(array, 9);
	}
}
