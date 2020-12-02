package shrutiC;

import java.util.Scanner;

public class Program3 {

	void findSumOfEvenNum(int[] array) {
		int sum = 0;
		System.out.print("Array - {");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
			if (array[index] % 2 == 0)
				sum += array[index];
		}
		System.out.println("}");
		System.out.println("Sum of all even numbers in an array is : " + sum);
	}

	public static void main(String[] args) {

		Program3 program = new Program3();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter length of an array of numbers");
		int arraySize = scanner.nextInt();
		int[] numArray = new int[arraySize];
		for (int index = 0; index < arraySize; index++) {
			System.out.println("Enter num " + (index + 1));
			numArray[index] = scanner.nextInt();
		}
		program.findSumOfEvenNum(numArray);
	}

}
