package rohit;
//Find the frequency of each character from user given word.
import java.util.Scanner;

public class Charfrequency {
	
	void characterfrequency(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int index = 0; index < str.length(); index++) {
				if (str.charAt(index) == ch)
					count++;
			}
			System.out.println("Character- " + ch + " Frequency- " + count);
			count = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charfrequency charfrequency = new Charfrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter String- ");
		String str = sc.next();
		charfrequency.characterfrequency(str);
	}

}
