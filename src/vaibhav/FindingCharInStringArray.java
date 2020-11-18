package vaibhav;

//this Program will display each character's frequency for each string in string array

import java.util.Scanner;

public class FindingCharInStringArray {
	
	public static void findEachCharFrequency(String [] stringArray) {
		for (int index = 0 ; index < stringArray.length; index++) {
			String temp=stringArray[index];
			for (int j = 0 ; j < temp.length(); j++ ) {
				int count=0;
				char temp1=temp.charAt(j);
				for(int k = 0; k < temp.length(); k++ ) {
					if(temp1 == temp.charAt(k))
						count++;
				}
				System.out.println("Character "+temp1+" is present "+count+" times in "+temp);
			}
		}		
	}

	public static void main(String[] args) {
		int length=0;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please input length of array :");
		length = scanner.nextInt();
		String [] stringArray=new String[length];
		//Accepting an array
		for(int index = 0; index < length; index++) {
			System.out.println("Please input "+(index+1)+" string in array :");
			stringArray[index] = scanner.next();			
		}
		FindingCharInStringArray.findEachCharFrequency(stringArray);
	}

}
