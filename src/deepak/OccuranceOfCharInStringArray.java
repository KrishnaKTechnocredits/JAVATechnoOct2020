/*Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5
*/

package deepak;

import java.util.Scanner;

public class OccuranceOfCharInStringArray {
	static int totalCount;
	
	void search(String[] input, char ch) {
		int localCount=0;
		for(int index=0; index < input.length; index++) {
			String wd = input[index];
			for(int i=0; i < wd.length()-1; i++) {
				if(wd.charAt(i)== ch) {
					totalCount++;
					localCount++;			
			}
		}
			System.out.println("Search found In "+ input[index] + " "+ localCount);
		}
		
		System.out.println("Search found in entire array of string  "+ " "+ totalCount);
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many words you want to enter in String Array: ");
		
		int count = sc.nextInt();
		
		String[] arr = new String[count];
		
		for( int i=0; i < count; i++) {
			
			System.out.println("Please enter String");
			
			arr[i]= sc.next();
		}
		
		System.out.println("Please enter a word which you wants to Search in String Array: ");
		
		char search = sc.next().charAt(0);
		
		OccuranceOfCharInStringArray occuranceOfCharInStringArray = new OccuranceOfCharInStringArray();
		occuranceOfCharInStringArray.search(arr, search);
	}

}
