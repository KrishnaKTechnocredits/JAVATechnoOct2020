package ritika.Assignments;
/*Assignment - 29 : 26th Nov'2020

Find second maximum from array without sorting the array.
*/
public class Asgmt_29 {
	
	static void arraySorting(int[] input) {
		int maxNum = input[0];
		int secondMaxNum = 0;
		for (int index = 1; index<input.length; index++) {
			if(maxNum<input[index]) {
				secondMaxNum = maxNum;
				maxNum = input[index];
			}
			else if (secondMaxNum<input[index]) 
				secondMaxNum = input[index];
		}
		System.out.println("Second maximum number from given array is: "+secondMaxNum);
	}
	public static void main(String[] args) {
		int[] input = {100, 257, 134, 297, 214, 377, 134, 125};
		Asgmt_29.arraySorting(input);
	}

}
