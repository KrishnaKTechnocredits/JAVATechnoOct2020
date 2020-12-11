package milind;

public class SumOfArmstrongNumber {
	
	void armstrongNumberSum(int[] arr){
		int temp = 0;
		int sum = 0;
		for(int index = 0; index < arr.length; index++) {
			int armstrongNumber = 0;
			temp = arr[index];
			while (temp > 0) {
				int modOfNumber = temp % 10;
				armstrongNumber = armstrongNumber + (modOfNumber * modOfNumber * modOfNumber);
				temp = temp / 10;
			}
			if(arr[index] == armstrongNumber) {
				sum = sum + arr[index];
			}
		}
		System.out.println("Sum of armStrong number is : " + sum);
	}
	
	public static void main(String[] args) {
		int[] input = {153, 111, 124, 371};
		SumOfArmstrongNumber sumOfArmstrongNumber = new SumOfArmstrongNumber();
		sumOfArmstrongNumber.armstrongNumberSum(input);
	}

}
