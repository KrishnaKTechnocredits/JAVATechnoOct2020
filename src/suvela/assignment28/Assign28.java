/*find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/
package suvela.assignment28;

public class Assign28 {
	void maxSumOfTriplet(int[] array) {
		int max = 0;
		int temp2 = 0;
		int temp1 = 0;
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if (max < array[i] + array[j] + array[k]) {
						max = array[i] + array[j] + array[k];
						temp2 = array[k];
						temp1 = array[j];
						temp = array[i];
					}
				}
			}
		}
		System.out.print("Maximum sum of triplet :" + temp + "," + temp1 + "," + temp2 + ":>" + max);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		Assign28 assign = new Assign28();
		assign.maxSumOfTriplet(arr);
	}

}
