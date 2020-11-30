
package monika;
/*Find the frequency of character from a given String array.

Assignment 15 : 11th Oct 2020 

Program 1  :  [ Compulsory ]
Find the frequency of character from a given String array. 
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
              elephant -> 2
              earth -> 1
              Total occurrence of e -> 5
			  
			  */



class StringOccurance {
	void charOccurance(String[] name, char ch) {
		int cnt = 0;

		for (int index = 0; index < name.length; index++) {
			for (int i = 0; i < name[index].length(); i++)
				if (name[index].charAt(i) == ch)
					cnt++;
			System.out.print(name[index] + "\t");
		}
		System.out.println("\nOccurance of Character " + ch + " is:" + cnt);
	}

	public static void main(String[] args) {
		StringOccurance string = new StringOccurance();
		String[] arr = { "technocredits", "elephant", "earthear" };
		string.charOccurance(arr, 'e');
	}
} 