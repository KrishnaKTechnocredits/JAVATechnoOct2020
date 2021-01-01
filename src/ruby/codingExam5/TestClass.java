package ruby.codingExam5;
/*class TestClass{
    // write your code here
public static void main(){
	Manager manager = new TestClass();
	int[] arr = {10,3,5,2,9,7,8};
	int target = 9;
	int[] arr1 = manager.findTargetIndex(arr,target);
	System.out.println("first index -> " + arr1[0]); // 3
	System.out.println("second index -> " + arr1[1]); // 5
}
}*/

public class TestClass implements Manager {

	public int[] findTargetIndex(int[] arr, int target) {
		int[] num = new int[2];
		int count=0;
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index; innerIndex < arr.length; innerIndex++) {
				if (arr[index] + arr[innerIndex] == target) {
					num[count] = index;
					num[count+1]= innerIndex;
				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Manager manager = new TestClass();
		int[] arr = { 10, 3, 5, 2, 9, 7, 8 };
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr, target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5
	}

}
