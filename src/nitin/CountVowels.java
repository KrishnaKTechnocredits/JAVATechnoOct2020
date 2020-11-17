package nitin;
/*Assignment - 15 - WAP[2] - to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i */
import java.util.Scanner;

public class CountVowels {
	static int aCount,eCount,iCount,oCount,uCount=0;
	public void countVowels(String word) {
		for(int index=0;index<word.length();index++) {
			char ch=word.toLowerCase().charAt(index);
			switch(ch) {
				case 'a':
						System.out.print(ch+" ");
						aCount++;
						break;
				case 'e':
						System.out.print(ch+" ");
						eCount++;
						break;
				case 'i':
						System.out.print(ch+" ");
						iCount++;
						break;
				case 'o':
						System.out.print(ch+" ");
						oCount++;
						break;
				case 'u':
						System.out.print(ch+" ");
						uCount++;
						break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word : ");
		String word=sc.next();
		CountVowels countVowels=new CountVowels();
		countVowels.countVowels(word);
		if (iCount == 0 && oCount == 0 && eCount == 0 && uCount == 0)
			System.out.println("No vowels available in a given word.");
		else {
			int totCount = aCount + eCount + iCount + oCount + uCount;
			System.out.println();
			System.out.println("Total vowels in a given word are :" + totCount);
		
		sc.close();
		}
	}
}
