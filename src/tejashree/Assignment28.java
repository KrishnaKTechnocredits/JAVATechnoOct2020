package tejashree;

class Assignment28 {

	public void findMaxTriplet(int array[]) {
		int sum = 0;
		int maxSum = 0;
		int maxIndex = array[0];
		for (int index = 0; index < array.length; index += 3) {
			sum = array[index] + array[index + 1] + array[index + 2];

			if (sum > maxSum) {
				maxSum = sum;
				maxIndex = index;
			}
		}

		System.out.println("Maximum Sum Triplet is : " + "[" + array[maxIndex] + " " + array[maxIndex + 1] + " "
				+ array[maxIndex + 2] + "]" + " And sum is : " + maxSum);
	}

	public static void main(String[] args) {
		int a[] = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		new Assignment28().findMaxTriplet(a);

	}
}
