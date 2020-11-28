package tejashree;

public class Assignment29 {
	void findSecondMaxInArray(int[] arr) {
		int max=arr[0];
		int secondMax=0;		
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>max) {
				secondMax=max;
				max=arr[index];
			}
			else if(arr[index]>secondMax) {
				secondMax=arr[index];
			}
		}
		System.out.println("Max element is:"+max);
		System.out.println("Second max element is:"+secondMax);
	}
	public static void main(String[] args) {
		int arr[]= {10,-1,60,30,2,90,80,110};
		new Assignment29().findSecondMaxInArray(arr);
	}

}
