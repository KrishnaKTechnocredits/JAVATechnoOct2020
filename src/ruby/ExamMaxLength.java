package ruby;

import java.util.Scanner;

public class ExamMaxLength {
	
	String getMaxLength(String[] arr){
		int maxLenIndex=0;
		int length = arr[0].length();
		for (int index=0; index<arr.length;index++) {
			if (length <  arr[index].length()) {
				length = arr[index].length();
				maxLenIndex = index;
			}
		} 
		System.out.println("Lenth of Longest name is "+ length);
		System.out.println("Longest name is "+arr[maxLenIndex]);
		return arr[maxLenIndex];
	}
	
	void display(String name) {
		for(int index=0; index<name.length();index++) {
		if (index%2!=0)
			 System.out.print(name.charAt(index));
		}	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many name you would like to compare. ");
		int length = scan.nextInt();
		String[] name = new String[length];
		
		for(int index=0; index<length;index++) {
			System.out.println("Enter name "+(index+1));
			name[index]=scan.next();		
		}
		ExamMaxLength exam = new ExamMaxLength();	
		String longestName = exam.getMaxLength(name);
		exam.display(longestName);		
	}
}
