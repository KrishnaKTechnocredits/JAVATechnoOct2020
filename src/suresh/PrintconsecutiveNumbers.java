package suresh;

import java.util.Arrays;

/*print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi
*/
public class PrintconsecutiveNumbers {
	
	void printconsecutivenumbers(int[] arr) {
		System.out.println("Given Array: " + Arrays.toString(arr));
		for (int index = 0; index < arr.length - 2; index++) {
		if(index+2<=arr.length-1)
			if(arr[index]==(arr[index+1]-1) && arr[index]==(arr[index+2]-2))
			System.out.println(arr[index]+" "+arr[index+1]+" "+arr[index+2]+" -->Hi ");
		}
		System.out.println("=========================================");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,8,9,11,12,13,14,15,18,19,20};
		PrintconsecutiveNumbers consecutivenumbers = new PrintconsecutiveNumbers();
		consecutivenumbers.printconsecutivenumbers(arr);
	}

}
