package anjaliS;

public class PrintIfThreeConsecutiveNumberIsPresent {
	void displayConsecutiveNumber(int arr[]) {
		int firstnumber = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			firstnumber = arr[i];
			if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2)
				System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2] + " " + "Hi");

		}

	}

	public static void main(String[] args) {
		PrintIfThreeConsecutiveNumberIsPresent printifthreeconsecutivenumberispresent = new PrintIfThreeConsecutiveNumberIsPresent();
		int array[] = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		printifthreeconsecutivenumberispresent.displayConsecutiveNumber(array);

	}

}
