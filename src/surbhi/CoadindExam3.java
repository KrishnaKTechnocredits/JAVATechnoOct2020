package surbhi;

public class CoadindExam3 {

	void duplicateNumber(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j])) {
					System.out.println("Duplicate Element : " + arr[j]);

				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 45, 16, 78, 12, 45 };
		CoadindExam3 coadindExam3 = new CoadindExam3();
		coadindExam3.duplicateNumber(arr);

	}
}
