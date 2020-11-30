package sadhana;

//Coding exam_4

public class CommonElementsBitweenArray {

	void printData(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j] == arr1[i])
					System.out.println(+arr1[i]);
			}
		}
	}

	public static void main(String[] args) {
		CommonElementsBitweenArray commonElementsBitweenArray = new CommonElementsBitweenArray();
		int num1[] = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int num2[] = { 1, 0, 6, 15, 6, 4, 7, 0 };
		System.out.println("Common elements between two array: ");
		commonElementsBitweenArray.printData(num1, num2);

	}

}
