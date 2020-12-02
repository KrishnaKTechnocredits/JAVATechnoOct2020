/*
 WAP to Reverse given string array.

*/

package yogita;

class ReverseStringArray {

	void reverseStringArray(String[] name) {
		System.out.println("Array is: ");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println("\nReverse Array is:");
		for (int i = name.length - 1; i >= 0; i--) {

			System.out.print(name[i] + " ");
		}
	}

	public static void main(String[] args) {
		ReverseStringArray arrayReverse = new ReverseStringArray();
		String[] array = { "hi", "hello", "gm", "gn" };
		arrayReverse.reverseStringArray(array);
	}
}