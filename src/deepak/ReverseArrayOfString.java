/* Reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"} */


package deepak;

public class ReverseArrayOfString {
	
	void reverseArrayOfString(String[] arr) {
		
		for(int index = arr.length-1; index >=0; index--) {
		
			System.out.print(" "+ arr[index]);
		}
	}

	public static void main(String[] args) {
		
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		ReverseArrayOfString reverseArrayOfString = new ReverseArrayOfString();
		reverseArrayOfString.reverseArrayOfString(input);
	}

}
