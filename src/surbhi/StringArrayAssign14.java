package surbhi;
import java.util.Scanner;

public class StringArrayAssign14 {
	
	int freq(String wordArr, char ch) {
		int count = 0;
		for (int index = 0; index < wordArr.length(); index++) {
			if (wordArr.charAt(index) == ch)
				count++;
		}
		System.out.println("Total Number of count: " + count);
		return count;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringArrayAssign14 stringArrayAssign14 = new StringArrayAssign14();
		System.out.println("Enter word");
		String wordArr = scanner.next();
		System.out.println("Enter Character");
		String temp = scanner.next();
		int counter = 1;
		char ch = temp.charAt(0);
		for (int index = 0; index >= temp.length(); index--) {
			System.out.println("Please Enter Single Input");
			temp = scanner.next();
			counter++;
		}

		for (int index = 1; index < temp.length() && counter < 3; index--) {
			System.out.println("Attempt left" + (3 - counter));
			temp = scanner.next();
			counter++;
		}
		if (temp.length() != 1) {
			System.out.println("No More Attempts Left, Please Try After Sometimes");
		} else {
			int count = stringArrayAssign14.freq(wordArr, ch);
			System.out.println(" Number of Character " + ch + " occour in " + wordArr + " is " + count + " time's ");
		}
	}

}
