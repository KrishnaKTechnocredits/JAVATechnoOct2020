/*Program 2:  Find duplicate number on Integer array in Java? [I know you have done this before, practice it one more time please]
Hint: There is exactly one number is repeated in the array. You need to write a program to
find that duplicate number. For example, if an array with length 6 contains numbers{0, 3,
1, 2, 3}, then duplicated number is 3. 
*/
package shrutiS.assignment30;

public class DuplicateNumber {
	
	void getInputArray(int[] input) {
		System.out.print("Input array = ");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + " ");
		}
	}
	
	void findDuplicateNumber(int[] input) {
		for(int index =0; index<input.length; index++) {
			for(int innerIndex = index+1; innerIndex<input.length; innerIndex++) {
				if(input[index] == input[innerIndex])
					System.out.println("\nDuplicate number is "+input[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		int[] input= {0,3,1,2,3};
		duplicateNumber.getInputArray(input);
		duplicateNumber.findDuplicateNumber(input);
	}
	
}
	


