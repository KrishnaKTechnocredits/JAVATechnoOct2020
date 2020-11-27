package monika;
/*
Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32
		 
		 */
		 
public class Exam3 {

	void duplicateNumber(int[] arr) {

		
			for (int i = 0; i < arr.length ; i++)
			{
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j])) {
					System.out.println("Duplicate From Given array : " + arr[j]);

				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 45, 16, 78, 12, 45 };
		Exam3 exam3 = new Exam3();
		exam3.duplicateNumber(arr);

	}
}