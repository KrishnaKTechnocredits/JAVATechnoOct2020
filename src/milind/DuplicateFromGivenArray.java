/* Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi */

package milind;

public class DuplicateFromGivenArray {
	
	void duplicateFromIntArray(int[] arr) {
		System.out.println("Duplicate Element from int array: ");
		for(int index = 0; index < arr.length; index ++) {
			int count = 0;
			for(int index1 = 0; index1 < arr.length; index1 ++) {
				if(arr[index] == arr[index1]) {
					count ++;
				}
			}
			if(count > 1) {
				System.out.println(arr[index]);
			}
		}
	}
	
	void duplicateFromStringArray(String[] arr) {
		System.out.println("Duplicate Element from string array: ");
		for(int index = 0; index < arr.length; index ++) {
			int count = 0;
			for(int index1 = 0; index1 < arr.length; index1 ++) {
				if(arr[index].equals(arr[index1])) {
					count ++;
				}
			}
			if(count > 1) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		DuplicateFromGivenArray duplicateFromGivenArray = new DuplicateFromGivenArray();
		int[] intArray = {10,12,55,32,17,12,32};
		String[] stringArray = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		duplicateFromGivenArray.duplicateFromIntArray(intArray);
		duplicateFromGivenArray.duplicateFromStringArray(stringArray);
	}

}
