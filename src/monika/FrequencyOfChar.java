/*Find the frequency of each character from user given word.*/

package monika;

import java.util.Scanner;

public class FrequencyOfChar {

       void findcharacterString( String word){
	         int count=0;
			 for(int index =0;index<word.length();index++)
			 {
			 char ch = word.charAt(index);
			   for (int i=0 ;i<word.length();i++)
			   {
			   if(word.charAt(i)==ch)
				          count ++;
			  }
				System.out.println("Character "+ch+" ocrrance "+count+"times");
				         count=0;
						 
				}

}	

public static void main(String[] args) {
		FrequencyOfChar frequencyofchar=new FrequencyOfChar();
		System.out.println("enter word");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		frequencyofchar.findcharacterString(name);
	}

}			

             				
							