package milind;

public class SecondMaxFromArray {
	
	void secondMaxArrayNumber(int[] input) {
		int temp;
		for(int index = 0; index < input.length; index++) {
			for(int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
				if(input[index] > input[innerIndex]) {
					temp = input[index];
					input[index] = input[innerIndex];
					input[innerIndex] = temp;
				}
			}
		}
		System.out.println("Second max number from Array : " + (input[input.length-2]));
	}
	
	public static void main(String[] args) {
		int[] input = {100, 102, 33, 35,99,30,105};
		SecondMaxFromArray secondMaxFromArray = new SecondMaxFromArray();
		secondMaxFromArray.secondMaxArrayNumber(input);
	}
}
