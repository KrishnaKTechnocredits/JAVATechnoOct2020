package priya;

public class Array {

	int getMinNumber(int num[]) {
		int min = num[0];
		for (int index = 0; index < num.length; index++) {
			if (min > num[index])
			min = num[index];
		}
		return min;
	}

	int getMaxNumber(int num[]) {
		int max = num[0];
		for (int index = 0; index < num.length; index++) {
			if (max < num[index])
			max = num[index];
		}
		return max;
	}

	float getAverage(int num[]) {
		float avg = 0;
		for (int index = 0; index < num.length; index++) {
			avg += num[index];
		}
		avg = avg / num.length;
		System.out.println("Average of numbers present in array is: " + avg);
		return avg;
	}

	float averageOfMinMax(int num[]) {
		return (getMaxNumber(num) + getMinNumber(num)) / 2;
	}

	void displayNumber(int num[]) {
		System.out.println("Numbers stored in array are in following order :: ");
		for (int index = 0; index < num.length; index++) {
			System.out.println(num[index] + " ");
		}
		System.out.println();
	}

	void displayReverseNumber(int num[]) {
		System.out.println("Numbers stored in array are in reverse order :: ");
		for (int index = num.length - 1; index >= 0; index--) {
			System.out.println(num[index] + " ");
		}
	}

	public static void main(String[] args) {
		Array array = new Array();
		int input[] = { -5,-10, 10, 20, 60 };
		System.out.println("Minimum No. is " + array.getMinNumber(input));
		System.out.println("Maximum No. is " + array.getMaxNumber(input));
		array.getAverage(input);
		float avg = array.averageOfMinMax(input);
		System.out.println("Average of minimum & maximum number present in array is " + avg);
		array.displayNumber(input);
		array.displayReverseNumber(input);
	}
}
