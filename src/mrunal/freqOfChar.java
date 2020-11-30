package mrunal;
import java.util.Scanner;
public class freqOfChar {
	



		void frequencyCheck(String userString, char ch) 
		{
			int counter = 0;
			for(int index = 0; index < userString.length(); index++)
				{
					if(userString.charAt(index) == ch) 
						{
							counter++;
						}
				}
			System.out.println("Frequency of "+ ch +" is : " +counter);
		}

		public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			freqOfChar fq = new freqOfChar();
			
			System.out.println("Enter String  : ");
			String userString = scanner.next();
			
			System.out.println("Enter Char to check frequency of String : ");
			String temp = scanner.next();
			
			int count = 1;
			
			while(temp.length() != 1 && count < 3)
				{
					System.out.println("Please Enter only char : ");
					temp = scanner.next();
					count++;
				}
			
			if(temp.length() != 1)
				{
					System.out.println("Tried multiple invalid attempt");
				}
			else 
				{
					char ch = temp.charAt(0);
					System.out.println(ch);
					fq.frequencyCheck(userString, ch);
				}
			
		}

	}

