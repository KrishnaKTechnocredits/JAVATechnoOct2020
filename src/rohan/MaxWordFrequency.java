package rohan;

import java.util.Scanner;

/*Assignment-18 : 14th Nov'2020 

Program : 1
max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

public class MaxWordFrequency {
	
	void maxWordFrequency(String str) {
		String[] strArray = new String[str.length()];
		strArray = str.split(" ");
		int maxCount=0;
		String word = null;
		for(int index=0;index<strArray.length;index++) {
			maxCount = 0;
			word = strArray[index];
			for(int occurenceIndex=0;occurenceIndex<strArray.length;occurenceIndex++) {
				if(strArray[occurenceIndex].equalsIgnoreCase(strArray[index])) {
					maxCount++;
					word = strArray[occurenceIndex];
					strArray[occurenceIndex].replace(strArray[occurenceIndex]," ");
				}
			}
		}
		System.out.println(word+"-->"+maxCount);
	}
	
	public static void main(String[] args) {
		MaxWordFrequency maxWord = new MaxWordFrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string line: ");
		String str = sc.nextLine();
		maxWord.maxWordFrequency(str);
		sc.close();
	}
}
