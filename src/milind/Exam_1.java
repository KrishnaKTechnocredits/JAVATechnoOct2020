package milind;

import java.util.Scanner;

public class Exam_1 {
	
	String maxLengthName(String[] arr) {
		int maxLengthOfname = arr[0].length();
		String maxLengthName = arr[0];
		for(int index = 0; index < arr.length; index++) {
			if(maxLengthOfname < arr[index].length()) {
				maxLengthOfname = arr[index].length();
				maxLengthName = arr[index];
			}
		}
		System.out.println("Maximum length name is : " + maxLengthName + " total length is " + maxLengthOfname);
		return maxLengthName;
	}
	
	void displayEvencharFromName(String name) {
		int nameLength = name.length();
		int index = 1;
		while(index <= nameLength) {
			System.out.println(name.charAt(index));
			index = index + 2;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many records you want :" );
		int arrayLength = scanner.nextInt();
		String[] array = new String[arrayLength];
		
		for(int index = 0; index < arrayLength; index++) {
			System.out.println("Enter " + (index+1) + " name :" );
			array[index] = scanner.next();
		}
		
		//String[] name = {"Milind", "Chavhan", "milindBhairavi", "Bhairavi", "Patil"};
		Exam_1 exam_1 = new Exam_1();
		String maxLengthName = exam_1.maxLengthName(array);
		exam_1.displayEvencharFromName(maxLengthName);
	}

}
