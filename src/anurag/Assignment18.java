/* Assignment 18 - 14th Nov'2020
	Program : 1
	max repeating word with its freq.
	input : Hi Hello Hi Techno Hello Hi
	output : Hi -> 3
	* Program : 2 
	String input = "hmPZ23i9Ws"
	output = "239PZWhmis" */

package anurag;

	public class Assignment18 {
		
		//Program 1:
		static void freq(String str) {
			String [] input=str.split(" ");
			int max = 0;
			String maxName = null; 
			for (int index = 0; index < input.length;index++) {
				int count = 0;
				String word = input[index];	
				if (str.contains(word)) {
					for ( int innerIndex = 0 ; innerIndex < input.length ; innerIndex++) {
						if (word.equals(input[innerIndex]))
							count++;
					}	
					str = str.replace(word," ");
					if(count > max) {
						max = count;
						maxName = word;
					}
				}
			}	
			System.out.println("Frequency of "+maxName+" is "+ max);
		}

		//Program 2
		static void processData(String input) {
					
			String number = "";
			String caps= "";
			String small = "";
			
			for( int index=0; index < input.length(); index++) {
				
				char ch = input.charAt(index);
				
				if(Character.isDigit(ch))
					number = number + ch;
				
				else if(Character.isUpperCase(ch))
					caps = caps + ch;
					
				else if(Character.isLowerCase(ch))
					small = small + ch;
			}
			
			System.out.println(number + caps + small);
			
		}

	
		
		public static void main(String[] args) {
			
			String input = "Hi Hello Hi Techno Hello Hi";
			Assignment18.freq(input);	
			
			String input2 = "hmPZ23i9Ws";

			Assignment18.processData(input2);
		}
	}