package rohan;

public class TestClass implements Manager {
	
	public static void main(String[] args) {
		Manager manager = new TestClass();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr, target);
		System.out.println("----Output1----");
		System.out.println("first index-->"+arr1[0]);
		System.out.println("first index-->"+arr1[1]);
		int[] arr2 = {10,3,5,2,6,8,8};
		int target1 = 9;
		int[] arr3 = manager.findTargetIndex(arr2, target1);
		System.out.println("----Output2----");
		System.out.println("first index-->"+arr3[0]);
		System.out.println("first index-->"+arr3[1]);
	}
	
	public int[] findTargetIndex(int[] arr, int target) {
		int[] tmpArr = new int[arr.length];
		for(int index=0;index<arr.length;index++) {
			for(int innerIndex=0;innerIndex<arr.length;innerIndex++) {
				if(arr[index]>target)
					break;
				else if(arr[index]+arr[innerIndex] == target) {
						tmpArr[0]=index;
						tmpArr[1]=innerIndex;
				}
			}
			
		}
		return tmpArr;
	}
}
