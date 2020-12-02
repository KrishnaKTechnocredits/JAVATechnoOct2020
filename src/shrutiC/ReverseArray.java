package shrutiC;

import java.util.Scanner;

/*
 * Program : 2 
 * reverse given string array.
 * input : {"Credits", "Techno","From","Diwali","Happy"}
 * output : {"Happy","Diwali","From","Techno","Credits"}
 * 
*/

public class ReverseArray {

	void reverseStringArray(String[] inputArray) {

		String[] outputArray = new String[inputArray.length];
		int outputArrayIndex = 0;

		System.out.print("Reversed Array : {");
		for (int index = inputArray.length - 1; index >= 0; index--) {
			outputArray[outputArrayIndex] = inputArray[index];
			System.out.print(outputArray[outputArrayIndex] + " ");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {

		ReverseArray object = new ReverseArray();

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the String array that is to be reversed:");
		 * System.out.print("Enter array size - "); int arraySize =
		 * scanner.nextInt(); String[] inputArray = new String[arraySize];
		 * 
		 * System.out.println(); for (int index = 0; index < arraySize; index++)
		 * { System.out.println("Enter data - " + index); inputArray[index] =
		 * scanner.next(); }
		 */

		String[] inputArray = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.print("Input Array : {");
		for (int index = 0; index < inputArray.length; index++) {
			System.out.print(inputArray[index] + " ");
		}
		System.out.println("}");
		object.reverseStringArray(inputArray);

	}

}
