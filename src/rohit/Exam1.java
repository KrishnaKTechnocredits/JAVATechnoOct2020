package rohit;

import java.util.Scanner;

public class Exam1 {

	void display(String[] args) {
		for (int index = 0; index < args.length; index++) {
			System.out.println(args[index]);
		}
	}

	String maximumlength(String[] args) {
		String maxlength = args[0];
		for (int index = 0; index < args.length; index++) {
			if (args[index].length() > maxlength.length()) {
				maxlength = args[index];
			}
		}
		return maxlength;
	}

	void displayevenchar(String maxstr) {
		for (int index = 0; index < maxstr.length(); index++) {
			if (index % 2 == 0) {
				System.out.println(maxstr.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of strings would you like to print- ");
		int length = sc.nextInt();
		String[] str = new String[length];
		for (int index = 0; index < length; index++) {
			System.out.println("Enter String " + (index + 1) + "-");
			str[index] = sc.next();
		}
		Exam1 exam1 = new Exam1();
		exam1.display(str);
		String s1 = exam1.maximumlength(str);
		System.out.println("Maximum length is- " + s1);
		exam1.displayevenchar(s1);
	}

}
