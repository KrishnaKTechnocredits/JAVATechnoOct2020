package milind;

public class MaxSumTriplateFromIntArray {
	
	void findMaxTriplateFromArray(int[] input){
		int maxSum = 0;
		int index = 0;
		while(index < input.length) {
			int sum = 0;
			for(int innerIndex = 0; innerIndex < 3; innerIndex++) {
				if(index < input.length) {
					int[] subArray = new int[3];
					subArray[innerIndex] = input[index];
					index++;
					sum = sum + subArray[innerIndex];
				}
				
			}
			if(maxSum < sum) {
				maxSum = sum;
			}
		}
		System.out.println("Max integer sum of triplate from array : " + maxSum);
	}
	
	public static void main(String[] args) {
		int[] input = {10,12,8,201,18,22,15,13,17,999};
		MaxSumTriplateFromIntArray maxSumTriplateFromIntArray = new MaxSumTriplateFromIntArray();
		maxSumTriplateFromIntArray.findMaxTriplateFromArray(input);
	}
}
