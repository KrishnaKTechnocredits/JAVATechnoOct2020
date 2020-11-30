package apurva;
// Find the frequency of given array but each frequency should be printed single time.
import java.util.Scanner;

public class Assignment_17 {
	void displayFrequency(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = 0;
			for (int index1 = 0; index1 < str.length(); index1++) {
				if (str.charAt(index1) == ch && index == str.indexOf(ch))
				count++;
			}
			if (count > 0)
				System.out.println(" Frequency of " + ch + " -> " + count + " " + " time's ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string:");
		new Assignment_17().displayFrequency(scanner.nextLine());
		scanner.close();
	}
}