/*Exam - 5 :
Program 2:
interface Manager{
int[] findTargetIndex(int[] arr,int target);
}

class TestClass{
// write your code here
public static void main(){
Manager manager = new TestClass();
int[] arr = {10,3,5,2,9,7,8};
int target = 9;
int[] arr1 = manager.findTargetIndex(arr,target);
System.out.println("first index -> " + arr1[0]); // 3
System.out.println("second index -> " + arr1[1]); // 5
}
}

output : 3 & 5*/

package ankita.assignment.exam;

import java.util.Arrays;

public class TestClass implements Manager {

	public int[] findTargetIndex(int[] arr, int target) {
		System.out.println("Input:" + Arrays.toString(arr));
		int[] temp = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == target) {
					temp[0] = i;
					temp[1] = j;
					break;
				}
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Manager manager = new TestClass();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr, target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5

	}
}
