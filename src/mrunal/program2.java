package mrunal;
/*------Assignment-19 : Program2------------
	reverse given string array.
	input : {"Credits", "Techno","From","Diwali","Happy"}
	output : {"Happy","Diwali","From","Techno","Credits"} */

public class program2 
{
	static void getReverseArray(String[] input)
	{
			
		for (int i = input.length - 1; i >= 0; i--) 
			{
				System.out.println(input[i]);
			}
	}

public static void main(String[] args) 
{
	String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
	program2.getReverseArray(input);
}
}
