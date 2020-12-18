package ruby;
/*/Find second Max Number/*/

public class Assignment29 {

	void findSecMax(int[] arr) {
		int max = 0, secMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				secMax = max;
				max = arr[i];
				
			}else if (secMax < arr[i])
				secMax = arr[i];
		}
		System.out.println("Second Max number in array is "+secMax);
	}

	public static void main(String[] args) {
		Assignment29 assign = new Assignment29();
		int[] arr = { 1, 2, 3,56,66,89};
		assign.findSecMax(arr);
	}
}
