/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

package poojap;

public class ReverseWordArray {

	void reverseWord(String[] word) {
		System.out.println("Array is : ");
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
		System.out.println(" \nReverse Array is : ");
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i]);
		}
	}

	public static void main(String[] args) {
		ReverseWordArray reverseWordArray = new ReverseWordArray();
		String[] array = { "Yogita ", "Pooja ", " Sonali ", "Nutan" };
		reverseWordArray.reverseWord(array);
	}
}
