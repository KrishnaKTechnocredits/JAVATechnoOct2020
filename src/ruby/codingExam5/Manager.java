package ruby.codingExam5;
/*Program 2: 
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

output : 3 & 5 */

public interface Manager {
	int[] findTargetIndex(int[] arr,int target);
}
