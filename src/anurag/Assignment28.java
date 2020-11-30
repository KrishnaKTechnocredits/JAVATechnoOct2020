/*Assignment - 28 : 25th Nov'2020 

find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/

package anurag;

public class Assignment28 {

	void sumOfTripletsMax(int[] ar) {
		int sumOfTriplets = 0;
		int sumMax = 0;
		String maxTriplet = "";
		String str = "";
		int counter = 0;
		for (int index = 0; index < ar.length; index++) {
			sumOfTriplets += ar[index];
			counter++;
			str = str + ar[index] + " ";
			if (counter == 3) {
				if (sumOfTriplets > sumMax) {
					sumMax = sumOfTriplets;
					maxTriplet = str;
					counter = 0;
				}
				counter = 0;
				sumOfTriplets = 0;
				str = "";
			}
		}
		System.out.println("Maximum triplet is: " + maxTriplet);
		System.out.println("Maximum sum is: " + sumMax);
	}

	public static void main(String[] args) {
		
		Assignment28 assignment28 = new Assignment28();
		int[] num = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		assignment28.sumOfTripletsMax(num);
	}
}
