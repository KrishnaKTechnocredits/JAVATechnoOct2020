package suresh;

/* 	Assignment 14 - Find the frequency of character from a given String array*/
import java.util.Scanner;
public class CountofChar {


	public int findFrequencyOfChar(String string, char charactor) {
		int count=0;
		for(int index=0; index<string.length();index++) {
			if(string.charAt(index)==charactor)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String string=scanner.next();
		System.out.println("Enter single character you want to find occurance in string:");
		System.out.println("Occurance of character in string: "+new CountofChar().findFrequencyOfChar(string, scanner.next().charAt(0)));
		scanner.close();
	}
}
