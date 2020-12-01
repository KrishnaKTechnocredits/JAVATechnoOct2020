package mrunal;
//Assignment16: To find the frequency of each character from user given word
import java.util.Scanner;

public class freq 
{
		void frequency(String str)
		{
			int count = 0;
			for (int index = 0; index < str.length(); index++) 
			{
				char ch = str.charAt(index);
				for (int i = 0; i < str.length(); i++)
				{
					if (str.charAt(i) == ch)
						count++;
				}
				System.out.println(ch  + " count is : " + count  );
					count =0;
			}
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			freq f = new freq();
			
			System.out.println("Enter String  ");
			String word = scanner.next();
			f.frequency(word);
			scanner.close();
		}
	} 
