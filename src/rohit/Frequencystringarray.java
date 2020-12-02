package rohit;

//To find the frequency of character from a given String array.
import java.util.Scanner;

public class Frequencystringarray {

	void charfrequency(String str[], char chr) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			String name = str[i];
			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == chr)
					count += 1;
			}
		}
		if (count > 0)
			System.out.println("Character- " + chr + " ,Occurence- " + count);
		else
			System.out.println("Invalid Character");
	}

	public static void main(String[] args) {
		Frequencystringarray frequencystringarray = new Frequencystringarray();
		System.out.println("Enter the number of string which you want to enter- ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String[] str = new String[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Enter name " + (i + 1) + "- ");
			str[i] = sc.next();
		}
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		frequencystringarray.charfrequency(str, ch);
	}
}