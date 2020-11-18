package ankit.Scanner;

//Assignment15: To scan the character occurrence in user given string array.
import java.util.Scanner;

public class ComplexScanner {
	static int counter;

	void characterOcurance(String[] arr, char character) {
		for (int index = 0; index < arr.length; index++) {
			for (int i = 0; i < arr[index].length(); i++)
				if (arr[index].charAt(i) == character)
					counter++;
		}

		System.out.println(counter);
	}

	public static void main(String[] args) {
		ComplexScanner complexScanner = new ComplexScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to store and compare character occurance");
		int length = scanner.nextInt();
		String[] arr = new String[length];
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Please enter name " + (index + 1) + "  for character verification");
			String names = scanner.next();
			arr[index] = names;
		}
		System.out.println("Which letter you want to check in all the names");
		char character = scanner.next().charAt(0);
		complexScanner.characterOcurance(arr, character);
		scanner.close();
	}

}
