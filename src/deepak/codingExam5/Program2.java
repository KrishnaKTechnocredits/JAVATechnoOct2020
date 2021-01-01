package deepak.codingExam5;

public class Program2 implements Manager {
	
	//@Override
	public int[] findTargetIndex(int[] arr, int target) {
		int[] output = new int[2];
		for (int i=0; i<arr.length-1; i++) {
			int num1=arr[i];
			int sum=0;
			if(num1<target) {
				for (int j=i+1; j<arr.length; j++) {
					int num2 = arr[j];
					sum = num1+num2;
					if(sum==target) {
						output[0] = i; 
						output[1] = j;
						break;
					}
				}
			}
		}
		return output;
	}

	public static void main(String[] args){
		Manager manager = new Program2();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr, target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5
	}
}