/*
 * Assignment 19: Reverse given string array.
 */
package ankit.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringArray {

	String[] arrayreverse(String[] array) {
		String[] temp = new String[array.length];
		int count = 0;
		for (int index = array.length - 1; index >= 0; index--) {
			temp[count++] = array[index];
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many string value want to enter: ");
		int length = scanner.nextInt();
		String[] array = new String[length];
		for (int index = 0; index < length; index++) {
			System.out.println("Please enter the " + (index + 1) + " string for array");
			String names = scanner.next();
			array[index] = names;
		}
		ReverseStringArray reverseStringArray = new ReverseStringArray();
		String[] output = reverseStringArray.arrayreverse(array);
		System.out.println("Reverse string array is: " + Arrays.toString(output));
		scanner.close();

	}

}
