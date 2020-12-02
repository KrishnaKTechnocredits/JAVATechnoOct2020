package rohan;

import java.util.Scanner;

public class VowelsFinder {
	int aCnt,eCnt,iCnt,oCnt,uCnt;
	
	void findVowels(String str) {
		int cnt=0;
		String vowels = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			switch(ch) {
				case 'A':
				case 'a': 
						if(++aCnt==1)
							vowels += ch+",";
						break;
				case 'E':
				case 'e':
						if(++eCnt==1)
							vowels += ch+",";
						break;
				case 'I':
				case 'i':
						if(++iCnt==1)
							vowels += ch+",";
						break;
				case 'O':
				case 'o':
						if(++oCnt==1)
							vowels += ch+",";
						break;
				case 'U':
				case 'u':
						if(++uCnt==1)
							vowels += ch+",";
						break;
				}
			}
		System.out.println("Vowels are: "+vowels);
		System.out.println("Total count of vowels in String: "+str+" is "+(aCnt+eCnt+iCnt+oCnt+uCnt));
	}
	
	public static void main(String[] args) {
		VowelsFinder vowelsFinder = new VowelsFinder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		vowelsFinder.findVowels(str);
		sc.close();
	}
}
