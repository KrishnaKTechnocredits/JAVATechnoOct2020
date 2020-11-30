package rohit;

import java.util.Scanner;

public class Frequency {

	void charfrequency(String str, char chr) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == chr)
				count++;
		}
		if (count > 0)
			System.out.println("Character- " + chr + " ,Occurence- " + count);
		else
			System.out.println("Character does not exists!");
	}

	public static void main(String[] args) {
		Frequency frequency = new Frequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String name = sc.next();
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		frequency.charfrequency(name, ch);
	}
}