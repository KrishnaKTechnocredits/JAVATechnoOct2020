package priyanka.Assignment19;

import java.util.Arrays;

/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
*/

public class ReverseStringArray {

	void revStringArr(String[] str) {
		for (int index = str.length - 1; index >= 0; index--) {
			System.out.print(str[index] + " ");
		}
	}

	public static void main(String[] a) {
		ReverseStringArray reverseStringArray = new ReverseStringArray();
		String[] str = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("The String Array is: " + Arrays.toString(str));
		System.out.print("The reverse string is : ");
		reverseStringArray.revStringArr(str);
	}
}
