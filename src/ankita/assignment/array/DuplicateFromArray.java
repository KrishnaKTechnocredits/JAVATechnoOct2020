package ankita.assignment.array;import java.util.Arrays;

import suresh.arrayExample4;

public class DuplicateFromArray {
	void getDuplicateFromIntArray(int[] arr) {
		System.out.print("Duplicate from Int array:");
		for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i] == arr[j]) 
						System.out.print(arr[i]+" ");
				}
			}
		}

	void getDuplicateFromStringArray(String[] arr) {
		System.out.print("Duplicate from String array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) 
					System.out.print(arr[i]+ " ");
			}
		}
	}
	public static void main(String[] args) {
		int[] intArr = { 10, 12, 55, 32, 17, 12, 32 };
		String[] strArr = { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi" };
		DuplicateFromArray duplicateFromArray = new DuplicateFromArray();
		System.out.println("Int array : " + Arrays.toString(intArr));
		duplicateFromArray.getDuplicateFromIntArray(intArr);	
		System.out.println("\nString array : " + Arrays.toString(strArr));
		duplicateFromArray.getDuplicateFromStringArray(strArr);
	}
}