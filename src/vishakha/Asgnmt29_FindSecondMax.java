//Find second maximum from array without sorting the array.

package vishakha;

public class Asgnmt29_FindSecondMax {
	
	void findSecMax(int[] arr){
			int max = arr[0];
			int secondMax = arr[1];
			for (int index = 2; index < arr.length; index++) {
				if (arr[index] > max) {
					max = arr[index];
				} else if (arr[index] > secondMax && arr[index] != max)
					secondMax = arr[index];
			}
			if (secondMax > max) {
				int temp = max;
				max = secondMax;
				secondMax = temp;
			}
			System.out.println("Second Max: " + secondMax);
		}

	public static void main(String[] args) {
		int[] arr = {10,99,24,97,43,77};
		new Asgnmt29_FindSecondMax().findSecMax(arr);
	}
}
