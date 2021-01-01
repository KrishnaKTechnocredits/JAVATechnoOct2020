package raghvendra.Exam;
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
}*/
public class TestClass implements Manager {
	public int[] findTargetIndex(int[] arr, int target) {
		int[] targetArray=new int[arr.length];
		int count=0;
		for(int index=0;index<arr.length;index++) {
			for(int innerIndex=index+1;innerIndex<arr.length;innerIndex++) {
				
				if(arr[index]+arr[innerIndex]==target) {
					targetArray[count]=index;
					targetArray[count+1]=innerIndex;
					count++;
				}
			}
		}
		return targetArray;
	}
	public static void main(String[] args) {
		Manager manager = new TestClass();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr,target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5

	}
}
