package anjaliS;

import java.util.Scanner;

public class Test1 {

	String getMaxLengthName(String[] arr) {
		int length = 0;
		String name = null;
		for (int index = 0; index <= arr.length - 1; index++) {
			if (arr[index].length() > length) {
				length = arr[index].length();
				name = arr[index];
			}

		}
		System.out.println(name + "->" + length);
		return name;

	}

	void displayEvenChar(String name) {
		for (int index = 0; index < name.length(); index++) {
			if (index % 2 == 0)
				System.out.print(name.charAt(index));

		}

	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the array  ");
		int length = scanner.nextInt();
		String names[] = new String[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Enter name " + i + 1);
			names[i] = scanner.next();
		}
		String name = test1.getMaxLengthName(names);
		test1.displayEvenChar(name);

	}

}
