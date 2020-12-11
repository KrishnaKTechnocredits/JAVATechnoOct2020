package vishakha;

import java.util.Scanner;

public class Exam1 {
	
	static String getMaxLength(String [] nameArray, int arrLength){
		int maxLength = nameArray.length;
		String maxLengthName = nameArray[0];
		for(int index=0; index<arrLength; index++){
			if(nameArray[index].length() > maxLength){
				maxLength = nameArray[index].length();
				maxLengthName = nameArray[index];
			}			
		}
		System.out.println("Name with maximum length is "+maxLengthName+ " and the length of the name is "+maxLength);
		return maxLengthName;
	}
	
	static void printAllEvenChar(String maxLengthName, int arrLength){
		for(int index=0; index<maxLengthName.length(); index++){
			if(index%2 != 0)
				System.out.println(maxLengthName.charAt(index));
		}
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to enter ? ");
		int arrLength = scanner.nextInt();
		String [] nameArray = new String[arrLength];
		
		for(int index=0; index<arrLength; index++){
			System.out.println("Enter name" + (index+1));
			nameArray[index] = scanner.next();
		}
		
		String maxLengthName = Exam1.getMaxLength(nameArray, arrLength);
		Exam1.printAllEvenChar(maxLengthName, arrLength);
	}
}
