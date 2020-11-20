package raghvendra;
/*Java Program to Count the Number of Vowels in user defined string.

Input : technocredits
output : vowels are e , o, i */
import java.util.Scanner;
public class FindVowel {
	void findVowelInString(String rr) {
		System.out.println("Vowels are:");
		for (int index=0;index<rr.length();index++) {
			char ch=rr.toLowerCase().charAt(index);
			switch(ch) {
				case 'a':
						System.out.print(ch+" ");
						break;
				case 'e':
						System.out.print(ch+" ");
						break;
				case 'i':
						System.out.print(ch+" ");
						break;
				case 'o':
						System.out.print(ch+" ");
						break;
				case 'u':
						System.out.print(ch+" ");
			}
				
		}
	}

		public static void main(String[] args) {
			FindVowel findVowel=new FindVowel();
			System.out.println("Enter String:");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			findVowel.findVowelInString(name);
		}
}
