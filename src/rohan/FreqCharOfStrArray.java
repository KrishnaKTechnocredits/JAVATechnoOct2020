package rohan;

import java.util.Scanner;

/*Program 1  :  [ Compulsory ]
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5
 */

public class FreqCharOfStrArray {

	void frequencyFinder(String[] str, char ch) {
		int totalCnt=0;
		for(int i=0;i<str.length;i++) {
			int cnt =0;
			String tmp = str[i];
			for(int j=0;j<tmp.length();j++) {
				if(tmp.charAt(j)==ch) {
					cnt++;
					totalCnt++;
				}
			}
			System.out.println(str[i]+"--> "+cnt);
		}
		System.out.println("Total occurence of character "+ch+"--> "+totalCnt);
	}

	public static void main(String[] args) {
		FreqCharOfStrArray fq = new FreqCharOfStrArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of string array: ");
		int arraySize = sc.nextInt();
		String strArray[] = new String[arraySize];
		for(int i=0;i<arraySize;i++) {
			System.out.println("Enter String"+i+1);
			strArray[i] = sc.next();
		}
		System.out.println("Enter the character to identify frequency in given array: ");
		String ch = sc.next();
		int cnt=1;
		while(ch.length()!=1 && cnt<3) {
			System.out.println("Please enter correct character: ");
			cnt++;
			System.out.println("Your are left with "+(4-cnt)+" attempts");
			ch = sc.next();
		}
		if(ch.length()!=1) 
			System.out.println("You have exceeded trials. Please try later");
		else 
			fq.frequencyFinder(strArray,ch.charAt(0));
		sc.close();
	}
}
