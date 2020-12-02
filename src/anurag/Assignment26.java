/* Assignment - 26: 23rd Nov'2020  
convert all capital letters to small and small to capital.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/

package anurag;

public class Assignment26 {
	
	void upperLowerCase(String input) {
	String str= "";
	char ch;
	System.out.println("String message: " + input);
	for(int i=0;i<input.length();i++) {
		if(Character.isUpperCase(input.charAt(i))){
			ch = Character.toLowerCase(input.charAt(i));
			str = str + ch;
		}
			else if(Character.isLowerCase(input.charAt(i))){
				ch = Character.toUpperCase(input.charAt(i));
				str = str + ch;
				
			}
			else
				str = str + input.charAt(i);
		}
		System.out.println("String output: " +str);
	}
		
	
	public static void main(String[] args) {
		
		Assignment26 assignment26 = new Assignment26();
		assignment26.upperLowerCase("tE1231GfrEsT456");
			
		}

	}


