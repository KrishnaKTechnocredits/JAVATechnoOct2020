package nandini;

public class SumofTriplets {
	
	void printMax_SumTriplet(int[] arr) {
		int maxIndex = 0;
		int max = 0;
		for (int index = 0; index < arr.length; index += 3) {
			int sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum > max) {
				max = sum;
				maxIndex = index;
			}
		}
		System.out.println("Maximum Sum Triplet is:" + arr[maxIndex] + "," + arr[maxIndex + 1] + "," + arr[maxIndex + 2]);
		System.out.println("Sum of Triplet is:" + max);
	}

	public static void main(String args[]) {
		SumofTriplets sumTriplets = new SumofTriplets();
		int input[] = {10,12,8,20,18,22,15,13,17};
		sumTriplets.printMax_SumTriplet(input);
	}

}
