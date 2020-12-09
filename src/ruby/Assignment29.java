package ruby;
/*/Find second Max Number/*/

public class Assignment29 {

	void findSecMax(int[] arr) {
		int num = 0, secMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num < arr[i]) {
				num = arr[i];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (num > arr[j] && secMax < arr[j]) {
				secMax = arr[j];
			}
		}
		System.out.println(secMax);
	}

	public static void main(String[] args) {
		Assignment29 assign = new Assignment29();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 15, 16,90};
		assign.findSecMax(arr);
	}
}
