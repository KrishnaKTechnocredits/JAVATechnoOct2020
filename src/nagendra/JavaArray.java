package nagendra;

public class JavaArray {

	int getMinimumNumber(int[] num) {

		int minimum = num[0];

		for (int index = 0; index < num.length; index++) {
			if (minimum > num[index]) {
				minimum = num[index];
			}
		}
		return minimum;
	}

	int getMaximumNumber(int[] num) {

		int maximum = num[0];

		for (int index = 0; index < num.length; index++) {
			if (maximum < num[index]) {
				maximum = num[index];
			}
		}
		return maximum;
	}

	int getAverageNumber(int[] num) {

		int totalSum = 0;
		int average;
		for (int index = 0; index < num.length; index++) {
			totalSum += num[index];
		}
		average = totalSum / num.length;
		return average;
	}

	void displayAllNumbers(int[] num) {

		System.out.println(" ---The Numbers from 0 till Array.length are --- ");

		for (int index = 0; index < num.length; index++) {
			System.out.println(" --->" + num[index]);
		}
	}

	void displayReverseNumbers(int[] num) {

		System.out.println(" ---The Numbers from Array.length till 0 are --- ");

		for (int index = num.length - 1; index >= 0; index--) {
			System.out.println(" --->" + num[index]);
		}
	}

	void getAverageOfMinAndMax(int minimum, int maximum) {
		int average = (minimum + maximum) / 2;

		System.out.println(" ---Average Of minimum And maximum number is --- " + average);

	}

	public static void main(String[] args) {

		int input[] = { 200, 100, 300, 400, -99 };
		JavaArray array = new JavaArray();
		int minimum = array.getMinimumNumber(input);
		System.out.println("   Minimum Number is:  " + minimum);

		int maximum = array.getMaximumNumber(input);
		System.out.println("   Maximum Number is:  " + maximum);

		int avg = array.getAverageNumber(input);
		System.out.println(" Average of Number is: " + avg);

		array.displayAllNumbers(input);
		array.displayReverseNumbers(input);
		array.getAverageOfMinAndMax(minimum, maximum);

	}

}
