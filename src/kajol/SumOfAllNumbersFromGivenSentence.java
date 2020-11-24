package kajol;

import java.util.Scanner;

public class SumOfAllNumbersFromGivenSentence {
	
	void findSumOfAllNumbers(String inputString) {
		String[] splittedArray=inputString.split(" ");
		int sum=0;
		String temp="";
		for(int index=0;index<splittedArray.length;index++) {
			String word=splittedArray[index];
			for(int innerIndex=0;innerIndex<word.length();innerIndex++) {
				if(Character.isDigit(word.charAt(innerIndex)))
					temp+=word.charAt(innerIndex);
				else {
					if(temp.length()>0) {
					sum+=Integer.parseInt(temp);
				    temp="";
					}
				}
			}	
		}
		if(temp.length()>0)
			sum+=Integer.parseInt(temp);
			System.out.println("Given String is: "+inputString);
			System.out.println("Sum of Digts: "+sum);		
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter a AlphaNumeric String");
		new SumOfAllNumbersFromGivenSentence().findSumOfAllNumbers(scanner.nextLine());
		scanner.close();
	}
}
