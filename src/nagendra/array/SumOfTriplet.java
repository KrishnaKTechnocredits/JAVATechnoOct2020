package nagendra.array;

/*
find the triplet having maximum sum.
[10,12,8,20,18,22,15,13,17]
output : maximum sum triplet 20,18,22 --> 60
*/
public class SumOfTriplet {

	void getMaxiMumTripletValue(int[] input) {

		int maxTriplet = 0;
		int sum = 0;
		int count = 0;
		int temp = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
			count++;
			if (count == 3 || i == input.length - 1) {
				count = 0;
				if (maxTriplet < sum) {
					maxTriplet = sum;
					temp = i;
					sum = 0;
				} else {
					sum = 0;
				}
			}
		}
		System.out.println(
				"Max Triplet is " + input[temp] + " " + input[temp - 1] + " " + input[temp - 2] + " :" + maxTriplet);
	}

	public static void main(String[] args) {
		SumOfTriplet triplet = new SumOfTriplet();
		int[] input = { 10, 12, 8, 20, 18, 22, 15, 13, 17, 20 };
		triplet.getMaxiMumTripletValue(input);

	}

}
