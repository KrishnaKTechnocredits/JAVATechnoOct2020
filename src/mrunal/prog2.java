package mrunal;
/*assignment 18 -----Program2 ------
 *  String input = "hmPZ23i9Ws"
	output = "239PZWhmis";
			 */

public class prog2
{
	static void charSorting(String format) 
	{
		String num = "", caps = "", small = "";
		
		for (int index = 0;index < format.length();index++)
					{
						char c= format.charAt(index);
						if(Character.isDigit(c))
							num=num+c;
						
						else if(Character.isUpperCase(c))
							caps=caps+c;
						
						else if(Character.isLowerCase(c))
							small=small+c;		
					}		
		System.out.println("order of string "+num+caps+small);
	}

public static void main(String[] args) 
{
		String s = ("hmPZ23i9Ws");
		System.out.println("output is " + s);
		prog2.charSorting(s);
	}
}