package ritika.Assignments;

/*Assignment - 28 : 25th Nov'2020

find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60
*/
public class Asgmt_28 {
	int maxSum = 0;
	String maxTriplet = null;

	void MaxSumOfTriplets(int[] input) {
		int sumOfTriplets = 0;
		String temp = "";
		int counter = 0;
		for (int index = 0; index < input.length; index++) {
			sumOfTriplets += input[index];
			counter++;
			temp = temp + input[index] + " ";
			if (counter == 3) {
				if (sumOfTriplets > maxSum) {
					maxSum = sumOfTriplets;
					maxTriplet = temp;
					counter = 0;
				}
				counter = 0;
				sumOfTriplets = 0;
				temp = "";
			}
		}
		System.out.println("Max sum triplet is: " + maxTriplet + "and its sum is: " + maxSum);
	}

	public static void main(String[] args) {
		Asgmt_28 assignment28 = new Asgmt_28();
		int[] input = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		assignment28.MaxSumOfTriplets(input);
	}
}
