package prasad.Stringandarray;

//time taken: 12 mins

public class TestClass implements Manager {
	
	public int[] findTargetIndex(int[] arr,int target) {
		int[] output = new int[arr.length];
		int outputindex=0;
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if((num+arr[j])==target) {
						output[outputindex]=i;
						outputindex++;
						output[outputindex]=j;
						outputindex++;
					}	
				}
			}
		}
		
		return output;
	}
	
	public static void main(String[]arg){
		Manager manager = new TestClass();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr,target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5
	}
}
