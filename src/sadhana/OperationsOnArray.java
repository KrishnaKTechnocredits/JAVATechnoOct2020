package sadhana;

/*
Assignment - 12 : 7th Oct'2020 
write a single program having different methods.
 
a) To find Min number from given array
b) To find Max number from given array
c) To find Avg of all numbers from give array
d) To display all numbers [0 to length]
e) To display all numbers [length to 0]
g) Method to find average of min and max number from array.
*/
class OperationsOnArray {
	int minNo(int[] num) {
		int result = num[0];
		for (int i = 1; i < num.length; i++) {
			if (result > num[i])
				result = num[i];
		}
		return result;
	}

	int maxNo(int[] num) {
		int result = num[0];
		for (int i = 1; i < num.length; i++) {
			if (result < num[i])
				result = num[i];
		}
		return result;
	}

	int average(int[] num) {
		int sum = 0;
		int counter = 0;
		int avg = 0;
		for (int index = 0; index < num.length; index++) {
			sum += num[index];
			counter++;
		}
		avg = sum / counter;
		return avg;
	}

	void allNo0ToLengeth(int[] num) {
		for (int index = 0; index < num.length; index++) {
			System.out.println(+num[index]);
		}
	}

	void allNoLenthTo0(int[] num) {
		for (int index = (num.length - 1); index >= 0; index--) {
			System.out.println(+num[index]);
		}
	}

	void minMaxAverage(int min, int max) {
		int avgMinMax = 0;
		avgMinMax = (min + max) / 2;
		System.out.println(avgMinMax);
	}

	public static void main(String[] args) {
		OperationsOnArray operationsOnArray = new OperationsOnArray();
		int num[] = new int[] { 5, 41, 7, 8, 35 };
		int minResult = (operationsOnArray.minNo(num));
		System.out.println("Minimum number from given Array : " + minResult);
		int maxResult = (operationsOnArray.maxNo(num));
		System.out.println("Maximum number from given Array : " + maxResult);
		int avgNo = (operationsOnArray.average(num));
		System.out.println("Average of given Array: " + avgNo);
		System.out.println("Elements of Array:");
		operationsOnArray.allNo0ToLengeth(num);
		System.out.println("Reverse elements of Array:");
		operationsOnArray.allNoLenthTo0(num);
		operationsOnArray.minMaxAverage(minResult, maxResult);
	}
}
