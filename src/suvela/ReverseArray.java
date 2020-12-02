/* Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

package suvela;

import java.util.Arrays;

public class ReverseArray {
	String[] arrayreverse(String[] array) {
		String[] temp = new String[array.length];
		int count = 0;
		for (int index = array.length - 1; index >= 0; index--) {
				temp[count++] = array[index];
		}
		return temp;
	}

	public static void main(String[] args) {
		String[] array = { "Credits", "Techno", "From", "Diwali", "Happy" };
		ReverseArray reverse = new ReverseArray();
		String[] output = reverse.arrayreverse(array);
		System.out.println(Arrays.toString(output));

	}

}
