package suvela.assignment30;

public class NumMissing {
	
	void findNum(int[] array) {
		int sum = 0;
		int number = 0;
		int length = array.length;
		int arraySum = (length + 1) * (length + 2) / 2;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		number = arraySum - sum;
		System.out.println("Missing number is :" + number);
	}

	public static void main(String[] args) {
		int[] input = { 10, 2, 3, 4, 6, 7, 1 };
		NumMissing number = new NumMissing();
		number.findNum(input);
	}
}


