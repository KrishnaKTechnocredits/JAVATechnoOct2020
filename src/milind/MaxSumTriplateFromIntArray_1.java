package milind;

public class MaxSumTriplateFromIntArray_1 {
	
	void findMaxTriplateFromArray(int[] input) {
		
		int maxSum = 0;
		int maxIndex = 0;
		
		for(int index = 0; index < input.length; index += 3) {
			int sum = input[index] + input[index + 1] + input[index + 2];
			if(sum > maxSum) {
				maxSum = sum;
				maxIndex = index;
			}
		}
		System.out.println("Sum of triplat is : " + maxSum + " and triplate is : " + input[maxIndex] + ", " + input[maxIndex + 1] + ", " + input[maxIndex]);
	}
		
	public static void main(String[] args) {
		int[] input = {10,12,8,20,18,22,15,13,17};
		MaxSumTriplateFromIntArray maxSumTriplateFromIntArray = new MaxSumTriplateFromIntArray();
		maxSumTriplateFromIntArray.findMaxTriplateFromArray(input);
	}
}
