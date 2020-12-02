package milind;

import java.util.Scanner;

public class FrequencyOfCharFromArray {
	static int totalRequency;
	static void charFrequencyFromArray(String[] array, int arrayLength,char ch) {
		for(int index = 0; index < arrayLength; index++) {
			String wordFromArray = array[index];
			int frequency = 0;
			for(int index1 = 0; index1 < wordFromArray.length(); index1++) {
				if(wordFromArray.charAt(index1) == ch ) {
					frequency++;
					totalRequency++;
				}
			}
			System.out.println("Frequency of char "+ ch +" in word " + wordFromArray + " is : " + frequency);
		}
		System.out.println("Total frequency of char "+ ch +" in array is :" + totalRequency);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of element in Array : ");
		int arrayLength = scanner.nextInt();
		String[] arrayElement = new String[arrayLength];
		System.out.println("Enter String : ");
		for(int index = 0; index < arrayLength; index++) {
			arrayElement[index] = scanner.next();
		}
		System.out.println("Enter char for frequency check : " );
		String temp = scanner.next();
		int count = 1;
		while(temp.length() != 1 && count < 3) {
			System.out.println("Please Try again, Enter Char ");
			temp = scanner.next();
			count++;
		}
		if(temp.length() != 1) {
			System.out.println("Tried Multiple Attempts, Try Sometime later");
		}else {
			char ch = temp.charAt(0);
			charFrequencyFromArray(arrayElement,arrayLength,ch);
		}
		//charFrequencyFromArray(arrayElement,arrayLength);
		scanner.close();
	}
}
