package anjaliP;

/*Assignment-19 : Program2
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"} */

public class ReverseStringInArray_Assign19 {
	
	static void getReverseArray(String[] input) {
		//String[] strArray = new String[input.length];
		// count = 0;
		for (int index = input.length - 1; index >= 0; index--) 
		{
			System.out.println(input[index]);
			//strArray[count] = input[index];
			//count++;
		}
	}

	public static void main(String[] args) {
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		ReverseStringInArray_Assign19.getReverseArray(input);
	}
}
