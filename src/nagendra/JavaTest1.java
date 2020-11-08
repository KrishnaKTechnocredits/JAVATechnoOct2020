package nagendra;

import java.util.Scanner;

public class JavaTest1 {

	String getMaxLengthName(String[] arr) {
		{
			String max = arr[0];

			for (int index = 0; index < arr.length; index++) {
				if (max.length() < arr[index].length()) {
					max = arr[index];

				}

			}
			return max;

		}
	}

	void display(String name) {

		for (int index = 0; index < name.length(); index++) {
			if (index % 2 != 0) {
				System.out.println(name.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		JavaTest1 exam = new JavaTest1();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many String will you enter ");
		int lenght = sc.nextInt();
		String[] name = new String[lenght];

		for (int i = 0; i < lenght; i++) {
			name[i] = sc.next();
		}
		String max = exam.getMaxLengthName(name);
		System.out.println("Maximim char staring is :" + max);
		System.out.println("Maximim char staring lengh is :" + max.length());

		exam.display(max);

	}

}
