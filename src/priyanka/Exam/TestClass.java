package priyanka.Exam;

public class TestClass implements Manager {
	
	public int[] findTargetIndex(int[] arr,int target) {
		
		int[] num = new int[2];
		for (int index= 0; index <arr.length; index++) {
			for (int innerIndex =index+1; innerIndex<arr.length; innerIndex++) {
				if (arr[index] + arr[innerIndex]== target) {
					num [0] = index;
					num [1] = innerIndex;	
				}	
			}
		}
		return num;
	}
	public static void main(String [] arg){
		Manager manager = new TestClass();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr,target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5
	}

}
