package milind;

public class PrintHiOn3ConsecutiveNumber {
	
	void consecutiveNumberInSequence(int[] arr){
		for(int index = 0; index < arr.length; index++) {
			if(index < arr.length -2) {
				if(arr[index+1] == arr[index]+1 && arr[index+2] == arr[index]+2) {
					System.out.println(arr[index] + ", " + arr[index+1] + ", " + arr[index+2] + " -> Hi" );
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,3,5,8,9,11,12,13,14,15,18,19,20,21};
		PrintHiOn3ConsecutiveNumber printHiOn3ConsecutiveNumber = new PrintHiOn3ConsecutiveNumber();
		printHiOn3ConsecutiveNumber.consecutiveNumberInSequence(input);
	}

}
