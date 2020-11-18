package nitin.Assignment_15;
/* Program 1  :  [ Compulsory ]
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5 */
import java.util.Scanner;
public class FindFrequencyInChar {
	public void frequencyOfCharInStringArray(String[] word, char ch) {
		int stringCount=0;
		for(int outer=0;outer<word.length;outer++) {//length is property for array
			int charCount=0;
			for(int inner=0;inner<word[outer].length();inner++) {//length is method for String
				if(word[outer].charAt(inner)==ch) {
					stringCount++;
					charCount++;
				}
			}
			System.out.println("'"+ch+"' Occurred "+charCount+" times in word : "+word[outer]+".");
		}
		System.out.println("In total '"+ch+"' Occurred "+stringCount+" times in all given words.");
	}
	
	public static void main(String[] args) {
		FindFrequencyInChar findFrequencyInChar = new FindFrequencyInChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of words you want to insert :");
		int num=sc.nextInt();
		String name[]=new String[num];
			for(int index=0;index<num;index++) {
				System.out.println("Enter word "+(index+1)+":");
				name[index]=sc.next();
			}
		System.out.print("Enter character you want to search in given words : ");
		findFrequencyInChar.frequencyOfCharInStringArray(name,sc.next().charAt(0));
		sc.close();
	}
	
}
