package nagendra.array;

/*
Find second maximum from array without sorting the array.
*/

public class SecondMaxFromArray {

	void getSecondMaximumArray(int[] input) {
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > secondMax) {
				if (input[i] > max) {
					secondMax = max;
					max = input[i];
				} else {
					secondMax = input[i];
				}
			}
		}
		System.out.println("Second Highest Number is: " + secondMax);
	}

	public static void main(String[] args) {
		int[] input = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		SecondMaxFromArray array = new SecondMaxFromArray();
		array.getSecondMaximumArray(input);
	}
}
