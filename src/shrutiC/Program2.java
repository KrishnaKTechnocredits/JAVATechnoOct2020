package shrutiC;

/*
 * Program 2:  print Hi when you find 3 consecutive numbers.
	1,2,3,5,8,9,11,12,13,14,15,18,19,20
	output :1,2,3 -> Hi
	11,12,13 -> Hi
	12,13,14 -> Hi
	13,14,15 -> Hi
	18,19,20 -> Hi
*/

public class Program2 {

	void findThreeConsecutiveNum(int array[]) {

		System.out.println("3 Consecutive numbers in an array are : \n");
		for (int i = 0; i < array.length; i++) {
			if (i != (array.length - 2)) {
				if (isConsecutiveNum(array[i], array[i + 1], array[i + 2]))
					System.out.println(array[i] + ", " + array[i + 1] + ", " + array[i + 2] + " -> Hi");
			} else
				break;
		}
	}

	boolean isConsecutiveNum(int num1, int num2, int num3) {

		if (num3 - num2 == 1 && num2 - num1 == 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Program2 object = new Program2();
		int[] array = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		object.findThreeConsecutiveNum(array);
	}

}
