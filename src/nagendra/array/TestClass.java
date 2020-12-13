package nagendra.array;

public class TestClass implements Manager{
	
	@Override
	public int[] findTargetIndex(int[] arr, int target) {
		int sum=0;
		int[] output=new int[2];
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<=arr.length-1;j++){
				sum=arr[i]+arr[j];
				if(sum==target){
					output[0]=i;
					output[1]=j;
				}
			}
		}
		return output;
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


	