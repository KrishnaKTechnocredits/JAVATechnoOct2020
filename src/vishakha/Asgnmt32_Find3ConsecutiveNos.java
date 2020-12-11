/*Program 2:  print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi*/

package vishakha;

public class Asgnmt32_Find3ConsecutiveNos {


	public void threeConsecutiveNumbers(int[] numArray) {
		for (int index = 0; index < numArray.length - 2; index++) {
			if (numArray[index + 1] == numArray[index] + 1 && numArray[index + 2] == numArray[index] + 2)
				System.out.println(numArray[index] + "," + numArray[index + 1] + "," + numArray[index + 2] + " -> Hi");
		}
	}

	public static void main(String[] args) {
		int[] input1 = { 1, 2, 3, 5, 8, 9, 11, 12, 13, 14, 15, 18, 19, 20 };
		new Asgnmt32_Find3ConsecutiveNos().threeConsecutiveNumbers(input1);
	}
}
