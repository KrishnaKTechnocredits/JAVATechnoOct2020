/*Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
         elephant -> 2
         earth -> 1
         Total occurrence of e -> 5*/


package vishakha;

import java.util.Scanner;

public class FreqOfCharFromStringArray {
	int totalFreqCount;
		
	void checkFrequency(String [] nameArray, char ch){
		for(int index=0; index<nameArray.length; index++){
			int countFreq = 0;
			String name = nameArray[index];
			for(int index1=0; index1<name.length(); index1++){
				if(name.charAt(index1) == ch){
					countFreq++;
					totalFreqCount++;
				}
			}
			if(countFreq>0)
			System.out.println("Name "+name+" has character '"+ch+ "' "+countFreq+ " times");
		}
		System.out.println("Total occurence of character' "+ch+ " is '"+totalFreqCount+ " times");
	}
	
	public static void main(String[] args) {
		FreqOfCharFromStringArray charFromStringArray =  new FreqOfCharFromStringArray();
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to enter ? ");
		int arrLength = scanner.nextInt();
		String[] nameArray = new String [arrLength];
		for(int index=0; index<arrLength; index++){
			System.out.println("Enter "+ (index+1) + " name ");
			nameArray[index] = scanner.next();
		}
		System.out.println("Enter character to check the frequency ");
		String name = scanner.next();
		while((name.length())!=1 && count<3){
			System.out.println("Enter a single character");
			name = scanner.next();
			count++;
		}
		if((name.length())!=1)
			System.out.println("Entered invalid character. Please try after sometime");
		else{
			char ch = name.charAt(0);
			charFromStringArray.checkFrequency(nameArray, ch);
		}
	}

}
