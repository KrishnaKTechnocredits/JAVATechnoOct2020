package mrunal;
/*Assignment 26 - convert all capital letter to small
 * and small letters to upper case
 * 
 *  String msg = "tE1GfrEsT";
    output : Te1gFReSt
    Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/

public class upper_lower_opposite_conversionn 
{

	void oppositeConversion(String str) 
	{
		System.out.println("Passed String is : " + str);
		String temp = "";
		for (int i = 0; i < str.length(); i++) 
		{
			if (Character.isUpperCase(str.charAt(i)))
				temp = temp + Character.toLowerCase(str.charAt(i));
			
			else if (Character.isLowerCase(str.charAt(i)))
				temp = temp + Character.toUpperCase(str.charAt(i));
			
			else
				temp = temp + str.charAt(i);
		}
		System.out.println("Output of the passed String is  : " + temp);
	}

	public static void main(String[] args) 
	{
		upper_lower_opposite_conversionn  a = new upper_lower_opposite_conversionn ();
		a.oppositeConversion("tE1GfrEsT");
	}
	}
