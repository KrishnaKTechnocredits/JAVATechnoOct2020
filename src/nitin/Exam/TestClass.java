package nitin.Exam;

public class TestClass implements Manager{
	@Override
	public int[] findTargetIndex(int[] arr,int target) {
		int temp[]= new int[2];
		for(int index=0;index<arr.length;index++) {
			for(int inner=index+1;inner<arr.length;inner++) {
				if(target==arr[index]+arr[inner]) {
					temp[0]=index;
					temp[1]=inner;
				}
			}
		}
		return temp;
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
