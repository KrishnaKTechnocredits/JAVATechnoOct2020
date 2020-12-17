package vaibhav.assignment36;

/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35,18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35*/


class FindIntersection {
	

private static void getIntersection(double[] arr1, double[] arr2) {
	for(int i = 0 ; i < arr1.length;i ++) {
		int count = 0 ;
		for (int j = 0; j<arr2.length;j++) {
			if (arr1[i] == arr2[j] ){
				arr2[j]=0;		
				count++;
			}
		}
		if (count > 0)
			System.out.print(","+arr1[i]);
		
	}	
}

	public static void main(String[] args) {
		
		double []arr1 = {10.45, 14.0, 18.35, 88.88, 54.10,10.45, 18.35};
        double []arr2 = {17.20, 13.30, 10.45, 18.35, 10.45, 13.30};
        FindIntersection.getIntersection(arr1,arr2);
        
        

	}

}
