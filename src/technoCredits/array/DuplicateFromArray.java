package technoCredits.array;

import java.util.Arrays;

public class DuplicateFromArray {
	void getDuplicateFromIntArray(int[] arr) {
		System.out.print("Duplicate from Int array:");
		for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						if(i < j) {
							System.out.print(arr[i]+" ");
							break;
						}else if(j < i) {
							break;
						}
					}
				}
			}
	}

	void getDuplicateFromStringArray(String[] arr) {
		System.out.print("Duplicate from String array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) 
					if(i < j) {
						System.out.print(arr[i]+ " ");
						break;
					}else if(j < i)
						break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] intArr = {32 , 10, 12, 55, 32, 17, 32,32,32,32,12, 32 };
		String[] strArr = { "Techno", "Credits", "Techno", "Hi","Techno","Techno", "Hello", "Hi" };
		DuplicateFromArray duplicateFromArray = new DuplicateFromArray();
		System.out.println("Int array : " + Arrays.toString(intArr));
		duplicateFromArray.getDuplicateFromIntArray(intArr);	
		System.out.println("\nString array : " + Arrays.toString(strArr));
		duplicateFromArray.getDuplicateFromStringArray(strArr);
	}
}