package vaibhav;

import java.util.Scanner;

public class FindingFrequencyChar {
	
	static void findChar(String []stringArray,char findOut) {
		int count=0;
		for(int i=0 ; i<stringArray.length ;
				i++) {			
			for (int j=0; j < stringArray[i].length();j++) {
				if (stringArray[i].charAt(j) == findOut)
					count++;
				}
			System.out.println("Character "+findOut+" is present "+count+" times in "+stringArray[i]);
			count =0;
			}	
		}
	
	public static void main(String[] args) {
		int length=0;
		char findOut=' ';
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please input length of array :");
		length = scanner.nextInt();
		String [] stringArray=new String[length];
		//Accepting an array
		for(int index = 0; index < length; index++) {
			System.out.println("Please input "+(index+1)+" string in array :");
			stringArray[index] = scanner.next();			
		}
		//Displaying an array
		System.out.println("Array provided from your end");
		for(int index = 0; index < length; index++) {//Displaying an Array
			System.out.print(" "+stringArray[index]);
					
		}
		System.out.println();
		System.out.println("Please input character you need to findout:");
		findOut=scanner.next().charAt(0);
		//calling a method to find out frequency
		FindingFrequencyChar.findChar(stringArray,findOut);
	}

}
