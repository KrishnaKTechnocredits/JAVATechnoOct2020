/*find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/


package vishakha;

public class Asgmnt28_FindTripletWithMaxSum {
	void findMaxTriplet(int[] arr) {

		int max = 0;
		int maxIndex = 0;
		for (int index = 0; index < arr.length; index += 3) {
			int sum = arr[index] + arr[index + 1] + arr[index + 2];
			if (sum > max) {
				max = sum;
				maxIndex = index;
			}
		}
		System.out.println(" The max sum triplet is : " + arr[maxIndex] + "," + arr[maxIndex + 1] + ","
				+ arr[maxIndex + 2] + " : " + max);
	}

	public static void main(String[] args) {
		Asgmnt28_FindTripletWithMaxSum asgmnt28_FindTripletWithMaxSum = new Asgmnt28_FindTripletWithMaxSum();
		int arr[] = {10,12,8,20,18,22,15,13,99};
		asgmnt28_FindTripletWithMaxSum.findMaxTriplet(arr);
	}

}
