package apurva;

public class Assignment12 {
	int minNumber(int value[]) {
		int min = 0;
		for (int index = 0; index < value.length; index++) {
			if (value[index] < min)
				min = value[index];
		}
		return min;
	}

	int maxNumber(int value[]) {
		int max = 0;
		for (int index = 0; index < value.length; index++) {
			if (value[index] > max)
				max = value[index];
		}
		return max;
	}

	int avgNumber(int value[]) {
		int sum = 0;
		int avg = 0;
		for (int index = 0; index < value.length; index++) {
			sum = sum + value[index];
			avg = sum / value.length;
		}
		return avg;
	}

	void displayOriginalArray(int[] value) {
		System.out.println("The Number from 0 till Array.length are:");
		for (int index = 0; index < value.length; index++) {
			System.out.println(" " + value[index]);
		}
	}

	void reverseArray(int[] value) {
		System.out.println("Average Array in Reverse Order: ");
		for (int index = value.length-1; index >= 0; index--) {
			System.out.println(" " + value[index]);
		}
	}

	void avgOfMinMax(int min, int max) {
		int avg = (min + max) / 2;
		System.out.println("Avgerage of Minimum & Maximum number is = " + avg);

	}

	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		int input[] = { -10, 10, 0, 20, -2, 50, 100, 20, -1, 10 };
		int ans1 = assignment12.minNumber(input);
		System.out.println("Minimum is = " + ans1);
		int ans2 = assignment12.maxNumber(input);
		System.out.println("Maximum is = " + ans2);
		int ans3 = assignment12.avgNumber(input);
		System.out.println("Average is = " + ans3);
		assignment12.displayOriginalArray(input);
		assignment12.reverseArray(input);
		assignment12.avgOfMinMax(ans1, ans2);

	}
}
