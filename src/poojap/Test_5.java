
package poojap;

import java.util.Arrays;

public class Test_5 {
	void findHightOfTree(int[] array) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
				count++;
			}
		}
		System.out.println("Count Of Visible Trees In Array Is : "+count);
	}

	public static void main(String[] args) {
		Test_5 test_5 = new Test_5();
		int[] array = { 11, 5, 13, 12, 16, 15, 17, 20 };
		System.out.println("Array Is : "+Arrays.toString(array));
		test_5.findHightOfTree(array);
	}
}