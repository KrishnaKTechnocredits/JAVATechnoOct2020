/*reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
*/
package ankita;

import java.util.Arrays;

public class ReverseStringArray {
	String[] getReversedStringArray(String[] input) {
		String[] temp = new String[input.length];
		int count = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			temp[count] = input[i];
			count++;
		}
		return temp;
	}

	public static void main(String[] args) {
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("Entered String Array:" + Arrays.toString(input));
		System.out.println(
				"Reversed string Array :" + Arrays.toString(new ReverseStringArray().getReversedStringArray(input)));
	}
}
