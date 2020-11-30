/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

package shrutiS.assignment19;

public class ReverseStringArray {

	void reverseStringArray(String[] input) {
		String[] temp = new String[input.length];
		int count = 0;
		System.out.print("\nReverse of given String Array : ");
		for (int index = input.length - 1; index >= 0; index--) {
			temp[count] = input[index];
			System.out.print(temp[count] + " ");
			count++;
		}
	}

	public static void main(String[] args) {
		ReverseStringArray stringArray = new ReverseStringArray();
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.print("Input String Array : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		stringArray.reverseStringArray(input);
	}
}
