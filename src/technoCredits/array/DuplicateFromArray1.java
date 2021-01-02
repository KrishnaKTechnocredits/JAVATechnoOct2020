package technoCredits.array;

import java.util.Arrays;

public class DuplicateFromArray1 {
	void getDuplicateFromIntArray(int[] arr) {
		System.out.print("Duplicate from Int array:");
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			boolean flag = false;
			if (num != 0) {
				for (int j = 0; j < arr.length; j++) {
					if (num == arr[j] && i!=j) {
						arr[j] = 0;
						flag = true;
					}
				}
				if(flag)
					System.out.print(num + " ");
			}
		}
	}

	void getDuplicateFromStringArray(String[] arr) {
		System.out.print("Duplicate from String array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]))
					System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] intArr = { 10, 12, 55, 32, 17, 12, 32, 32, 32 };
		String[] strArr = { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi" };
		DuplicateFromArray1 duplicateFromArray = new DuplicateFromArray1();
		System.out.println("Int array : " + Arrays.toString(intArr));
		duplicateFromArray.getDuplicateFromIntArray(intArr);
		System.out.println("\nString array : " + Arrays.toString(strArr));
		duplicateFromArray.getDuplicateFromStringArray(strArr);
	}
}