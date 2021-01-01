package suresh;

public class arrayExample4 {

	int listNumbersAsc() {
		int[] num = new int[5];
		for (int index = 0; index < num.length; index++) {
			num[index] = index + 1;
			System.out.println("Series of numbers:" + index);
		}
		return 0;
	}

	int listNumbersDesc() {
		int[] num = new int[0];
		for (int index = 5; index > num.length; index--) {
			System.out.println("Length to 0:" + index);
		}
		return 0;
	}

	int maxNumber(int num[]) {
		int max = num[0];

		for (int index = 0; index < num.length; index++) {

			if (max < num[index])
				max = num[index];
		}
		return max;
	}

	int minNumber(int[] input) {
		int min = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < min)
				min = input[index];
		}
		return min;
	}

	int avgNumber(int[] input) {
		int total = 0;
		for (int index = 0; index < input.length; index++) {
			total = total + input[index];
		}
		double average = total / input.length;
		System.out.println("The average is: %.3f" +average);
		return total;
	}

	int avgMinMax(int[] input) {
		
		int max = maxNumber(input);
		int min = minNumber(input);
		
		int avg = (min+max)/2;
		
		return avg;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayExample4 arrayexample4 = new arrayExample4();
		int input[] = { 15, 10, 19, 30, 122, 42, 99, -2, 12, 33 };
		int ans = arrayexample4.maxNumber(input);
		byte ans1 = (byte) arrayexample4.minNumber(input);
		System.out.println("Minimum Number is: " + ans1);
		System.out.println("Maximum Number is: " + ans);
		arrayexample4.listNumbersAsc();
		arrayexample4.listNumbersDesc();
		arrayexample4.avgNumber(input);
		System.out.println("Average minmax:"+ arrayexample4.avgMinMax(input));
	}
}
