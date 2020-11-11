package tejashree;

import java.util.Scanner;

//Program to find the frequency of characters in  a String array
public class Assignment15 {

	void findFrequency(String arr[], char ch) {
		int cnt = 0;
		String str = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int index = 0; index < str.length(); index++) {
				str=arr[i];
				if (str.charAt(index) == ch) {
					cnt++;
				}
			}
			
		}
		System.out.println("char" + "'" + ch + "'" + "is repeated " + cnt + " times");
	}

	public static void main(String[] args) {
		Assignment15 freqCharInStringArray = new Assignment15();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of an array");
		int len = sc.nextInt();
		String arr[] = new String[len];
		String str = arr[0];
		System.out.println("Enter elements in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		System.out.println("Enter character to be found");
		char ch = sc.next().charAt(0);
		freqCharInStringArray.findFrequency(arr, ch);

	}
}
