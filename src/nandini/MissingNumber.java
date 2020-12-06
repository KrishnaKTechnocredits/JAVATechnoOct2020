package nandini;

public class MissingNumber {
	
	void findMissingNumber(int[] arr) {
		int expNoOfElements = arr.length + 1;
		int totalsum = expNoOfElements * (expNoOfElements + 1) / 2;
		int sum =0;
		for(int i =0; i < arr.length; i++) {
			sum = sum + arr[i];	
		}
		int missingNumber = totalsum - sum;
		System.out.println("missing No is: " + missingNumber);
	}
	
	public static void main(String args[]) {
		MissingNumber missingNo = new MissingNumber();
		int[] input = {1,2,3,4,6,7,8,9,10};
		missingNo.findMissingNumber(input);
	}

}
