package nandini;

public class SecondMaxNumber {
	
	void findSecondMaxNum(int[] numArr) {
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > largest) {
				secondLargest = largest;
				largest = numArr[i];
		
			}
			else if (numArr[i] > secondLargest && numArr[i] != largest) {
				secondLargest = numArr[i];
			}
		}
		System.out.println("Second Largest Number From Array is:" + secondLargest);
	}
	
	public static void main(String args[]) {
		SecondMaxNumber secondMaxNum = new SecondMaxNumber();
		int[] input = {5, 2, 10, 25, 15, 40, 2 ,35,8};
		secondMaxNum.findSecondMaxNum(input);
	}
}
