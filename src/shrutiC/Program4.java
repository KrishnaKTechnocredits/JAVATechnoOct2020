package shrutiC;

import java.util.Scanner;

public class Program4 {

	void findPositiveNegative(int[] array) {

		int negativeNumCount = 0, positiveNumCount = 0, zerosCount = 0;
		System.out.print("Array - {");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
			if (array[index] == 0)
				zerosCount++;
			else if (array[index] < 0)
				negativeNumCount++;
			else
				positiveNumCount++;
		}
		System.out.println("}");
		System.out.println("Negative numbers  : " + negativeNumCount);
		System.out.println("Zeros  : " + zerosCount);
		System.out.println("Positive numbers  : " + positiveNumCount);

	}

	public static void main(String[] args) {
		Program4 program = new Program4();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter length of an array of numbers");
		int arraySize = scanner.nextInt();
		int[] numArray = new int[arraySize];
		for (int index = 0; index < arraySize; index++) {
			System.out.println("Enter num " + (index + 1));
			numArray[index] = scanner.nextInt();
		}
		
		program.findPositiveNegative(numArray);
	}

}
