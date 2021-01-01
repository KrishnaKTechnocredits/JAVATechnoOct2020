package surbhi;
import java.util.Arrays;

public class ReverseArray {

	public String[] reverseArray(String[] strArray) {
		String[] reverse = new String[strArray.length];
		for (int index = strArray.length - 1; index >= 0; index--)
			reverse[strArray.length - 1 - index] = strArray[index];
		return reverse;
	}

	public static void main(String[] args) {
		String[] strArray = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("String Array: " + Arrays.toString(strArray));
		ReverseArray arrayReverse = new ReverseArray();
		System.out.println("Reverse of String Array: " + Arrays.toString(arrayReverse.reverseArray(strArray)));
	}

}
