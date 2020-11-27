package mrunal;
/* assignemnt 18 -----Program1 ------
 * : max repeating word with its freq.
	input : Hi Hello Hi Techno Hello Hi
	output : Hi -> 3 */

public class prog1 
{
 static void displayCount(String str) 
 {
			String [] strArray=str.split(" ");
			int max = 0;
			String maxName = null; 
			for (int index = 0; index < strArray.length;index++)
			{
				int count = 0;
				String word = strArray[index];	
				if (str.contains(word)) 
				{
					for ( int innerIndex = 0 ; innerIndex < strArray.length ; innerIndex++)
					{
						if (word.equals(strArray[innerIndex]))
							count++;
					}	
					str = str.replace(word," ");
					if(count > max) 
					{
						max = count;
						maxName = word;
					}
				}
			}	
			
			System.out.println("Frequency of "+maxName+" - "+ max);
		}

		public static void main(String[] args) 
		{
			String value = "Hi Hello Hi Techno Hello Hi";
			prog1.displayCount(value);
		}
	}