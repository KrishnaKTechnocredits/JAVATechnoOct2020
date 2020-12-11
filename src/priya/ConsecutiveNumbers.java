//Program 2:  print Hi when you find 3 consecutive numbers.
//1,2,3,5,8,9,11,12,13,14,15,18,19,20

package priya;

public class ConsecutiveNumbers {

	void printConsecutiveNumbers(int[] num) {
		for (int i = 0; i < num.length - 2; i++) {
			if ((num[i + 1] == num[i] + 1) && (num[i + 2] == num[i] + 2))
				System.out.println(num[i] + "," + num[i + 1] + "," + num[i + 2] + "->" + "Hi");
		}
	}

	public static void main(String args[]) {
		int[] inputArr = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		new ConsecutiveNumbers().printConsecutiveNumbers(inputArr);
	}

}
