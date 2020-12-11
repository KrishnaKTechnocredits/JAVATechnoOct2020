package suvela;

import java.util.Scanner;

public class NumberArray {
	int count = 0;

	void findfrequency(int[] array, int num) {
		boolean flag = false;
		for (int index = 0; index < array.length; index++) {
			if (num == array[index]) {
				count++;
				flag = true;
			}

		}
		if (flag == true)
			System.out.println("Given number " + num + " is  present in the array for " + count + " times");
		else
			System.out.println("Given number " + num + " is not present in the array");
	}

	public static void main(String[] args) {
		int array[] = { 10, 3, 9, -99, 81, 3, -11 };
		NumberArray a = new NumberArray();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to be searched:");
		int num = scan.nextInt();
		a.findfrequency(array, num);

	}

}
