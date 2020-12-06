/*Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi

*/
package suvela.assign32;

public class ConsecutiveNumbers { 
	void findConsecutiveNum(int[] array) {
		boolean flag = true;
		for (int index = 0; index < array.length-2; index++) {
			if (array[index + 1] - array[index] == 1 && array[index + 2] - array[index + 1] == 1) {
				System.out.println(array[index] + "," + array[index + 1] + "," + array[index + 2] + ">" + "Hi");
				flag = false;
			}
			if (!flag)
				continue;
			else
				break;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		ConsecutiveNumbers num = new ConsecutiveNumbers();
		num.findConsecutiveNum(array);
	}

}
