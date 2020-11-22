/*Program : 3 
swap 2 String using 3rd variable*/

package kajol;

import java.util.Scanner;

public class SwapTwoStringUsing3rdVariable {
		
		void swapString(String string1, String string2) {
			System.out.println("Before Swaping String1 : "+string1);
			System.out.println("Before Swaping String2 : "+string2);
			String temp=string1;
			string1=string2;
			string2=temp;
			System.out.println("After Swaping String1 : "+string1);
			System.out.println("After Swaping String2 : "+string2);	
		}
		
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Please Enter two String To Swap:");
			System.out.println("String1: ");
			String string1=scanner.next();
			System.out.println("String2: ");
			String string2=scanner.next();
			new SwapTwoStringUsing3rdVariable().swapString(string1, string2);
			scanner.close();
				
		}

}
