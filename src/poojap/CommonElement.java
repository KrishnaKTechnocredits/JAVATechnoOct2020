
/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]
output: 1 7*/

package poojap;

import java.util.Arrays;

public class CommonElement {

	void findCommonElement() {
		int array1[] = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int array2[] = { 1, 0, 6, 15, 6, 4, 7, 0 };
		System.out.println("Array one : " + Arrays.toString(array1));
		System.out.println("Array Two : " + Arrays.toString(array2));
		System.out.println("Common Element is:");

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.print(array1[i] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		CommonElement commonElement = new CommonElement();
		commonElement.findCommonElement();
	}

}
