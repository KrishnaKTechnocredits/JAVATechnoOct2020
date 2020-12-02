package suvela;

import java.util.Scanner;

public class Assignment15 {
	static int count;

	void frequency(String[] array, char ch) {

		for (int index = 0; index < array.length; index++) {
			int cnt = 0;
			for (int index1 = 0; index1 < array[index].length(); index1++) {
				if (array[index].charAt(index1) == ch) {
					cnt++;
					count++;
				}
			}

			System.out.println(array[index] + "->" + cnt);

		}
		System.out.println("Count of char " + ch + " in the array is " + count);
	}

	public static void main(String[] args) {
		Assignment15 assign = new Assignment15();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int length = sc.nextInt();

		String[] array = new String[length];

		System.out.println("Enter char");
		String s = sc.next();

		while (s.length() > 1) {
			System.out.println("Wrong input. Enter again");
			s = sc.next();
		}
		char ch = s.charAt(0);
		for (int index = 0; index < length; index++) {
			System.out.println("Enter new string:");
			array[index] = sc.next();
		}
		assign.frequency(array, ch);

		sc.close();
	}

}
