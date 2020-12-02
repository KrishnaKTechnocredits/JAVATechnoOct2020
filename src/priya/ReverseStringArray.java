//Program : 2 :reverse given string array.
//input : {"Credits", "Techno","From","Diwali","Happy"}
//output : {"Happy","Diwali","From","Techno","Credits"}

package priya;

public class ReverseStringArray {
	
	public static void reverseWordFromArray(String [] word) {
	for (int index = word.length - 1; index >= 0; index--) {
		System.out.print(" " +word[index]);
	}
}
	
	public static void main(String[] args) {
		String[] word = {"Credits", "Techno","From","Diwali","Happy"};
		ReverseStringArray.reverseWordFromArray(word);
	}

}
