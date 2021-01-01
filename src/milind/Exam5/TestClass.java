package milind.Exam5;

public class TestClass implements Manager{

	@Override
	public int[] findTargetIndex(int[] arr, int target) {
		int count = 0;
		int[] array = new int[arr.length];
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] >= target) {
				continue;
			}else {
				for(int innerIndex = index+1; innerIndex < arr.length; innerIndex++) {
					if(arr[index] + arr[innerIndex] == target) {
						array[count] = index;
						array[++count] = innerIndex;
					}
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args){
		Manager manager = new TestClass();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr,target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5
	}
}
