package vaibhav;
/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

public class ReverseStringArray {
	
	public static void reverseArray(String [] given) {
		for (int index = given.length-1 ; index >= 0 ; index--) {
			System.out.print(" "+given[index]);
		}		
	}
	
	public static void main(String[] args) {
		String [] given = {"Credits", "Techno","From","Diwali","Happy"};
		ReverseStringArray.reverseArray(given);	
	}
}
