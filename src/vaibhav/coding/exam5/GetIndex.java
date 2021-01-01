package vaibhav.coding.exam5;


class GetIndex implements Manager{
	
	@Override
	public int[] findTargetIndex(int[] arr, int target) {
		int []finalArray= new int [2];
		
		for (int i = 0 ; i < arr.length;i++) {
			int sum= 0 ;
			for (int j = 1 ; j < arr.length;j++ ) {
				sum = arr[i]+arr[j];
				if (sum == 9) {
					finalArray[0] = i;
					finalArray[1] = j;
				}				
			}			
		}
	
		return finalArray;
	}
    
	public static void main(String [] args){
		Manager manager = new GetIndex();
		int[] arr = {10,3,5,2,9,7,8};
		int target = 9;
		int[] arr1 = manager.findTargetIndex(arr,target);
		System.out.println("first index -> " + arr1[0]); // 3
		System.out.println("second index -> " + arr1[1]); // 5
	}

	
}
