/*
  Assignment - 29 : 26th Nov'2020 
 Find second maximum from array without sorting the array.

 */

package yogita;

import java.util.Arrays;

public class FindSecondMax {

	void findFirstSecondMax(int[] array) {
		System.out.println("Array is:" + Arrays.toString(array));
		int maxFirst = 0;
		int maxSecond = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxFirst) {
				maxSecond = maxFirst;
				maxFirst = array[i];
		
			}
			else if (array[i] > maxSecond && array[i] < maxFirst) {
				maxSecond = array[i];
			}
		}
		System.out.println("First Max Number From Array is:" + maxFirst);
		System.out.println("Second Max:Number From Array is:" + maxSecond);
	}

	public static void main(String[] args) {
		FindSecondMax secondMax = new FindSecondMax();
		int[] input = { 4, 8, 9, 12, 17, 30, 2 ,28,6};
		secondMax.findFirstSecondMax(input);
	}

}
