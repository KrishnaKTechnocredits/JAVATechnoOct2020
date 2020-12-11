package ruby;
/*Assignment - 28 : 25th Nov'2020 

find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60*/

public class Assignment28 {

	void findSumOfTriplet(int[] input) {
		int temp = 0, sum = 0, i = 0, max = 0;
		for (int index = 0; index < input.length; index++) {
			temp += input[index];
			if (index % 3 == 2) {
				sum = temp;
				temp = 0;
				// System.out.println(sum);
				if (max < sum) {
					max = sum;
					i = index;
				}
			}
		}
		System.out.println(input[i - 2] + "," + input[i - 1] + "," + input[i] + " --> " + max);
	}

	public static void main(String[] args) {
		Assignment28 assign = new Assignment28();
		int[] num = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		assign.findSumOfTriplet(num);
	}
}
