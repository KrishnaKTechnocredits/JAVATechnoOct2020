/*Program 2: WAP to find two String are identical or not

input 1: 
String s1 = "technoCredits";
String s2 = "teChnoCreditS";

output 1: both string are not identical

input 2:
String s1 = "pune";
String s2 = "pune";

output 2: both string are identical*/

package kajol;

import java.util.Scanner;

public class FindIdenticalStrings {
	
	boolean areStringsIdentical(String inputString1, String inputString2) {	
		if(inputString1.length()==inputString2.length()) {
			for(int index1=0;index1<inputString1.length();index1++) {
					if(inputString1.charAt(index1)!=inputString2.charAt(index1))
						return false;
			}
		}else
			return false;
		return true;	
	}
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter Two Strings to Compare:");
		 System.out.println("String 1: ");
		 String inputString1 = scanner.next();
		 System.out.println("String 2: ");
		 String inputString2 = scanner.next();
		 
		 if(new FindIdenticalStrings().areStringsIdentical(inputString1, inputString2))
			 System.out.println("Strings are Identical");
		 else
			 System.out.println("Strings are not Identical");
		 scanner.close();
	}
    
}
