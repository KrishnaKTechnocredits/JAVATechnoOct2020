package rohit;
//Find the frequency of each character from user given word.
import java.util.Scanner;

public class Frequencycount {

	void characterfrequency(String str) {
		//int count = 0;
		for (int index1 = 0; index1 < str.length(); index1++) {
			char ch = str.charAt(index1);
			int count = 0;
			int i = str.indexOf(ch);
			if (i == index1) {
				for (int index2 = 0; index2 < str.length(); index2++) {
					if (str.charAt(index2) == ch)
						count++;
				}
				System.out.println("Character- " + ch + " Frequency- " + count);
				//count=0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frequencycount frequencycount = new Frequencycount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter String- ");
		String str = sc.next();
		frequencycount.characterfrequency(str);
	}

}
