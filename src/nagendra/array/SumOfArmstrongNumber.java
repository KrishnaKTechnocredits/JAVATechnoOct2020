package nagendra.array;

/*
return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524
*/

public class SumOfArmstrongNumber {

	void getSumOfArmstrongNumber(int[] input) {
		int totalSum = 0;
		for (int i = 0; i < input.length; i++) {
			int number = input[i];
			int sum = 0;
			while (number > 0) {
				int num = number % 10;
				sum += (num * num * num);
				number = number / 10;
			}
			if (sum == input[i])
				totalSum += input[i];
		}
		System.out.println("Total Sum of Armstrong Number  : " + totalSum);
	}

	public static void main(String[] args) {
		SumOfArmstrongNumber number = new SumOfArmstrongNumber();
		int[] input = { 153, 111, 124, 371 };
		number.getSumOfArmstrongNumber(input);
	}
}
