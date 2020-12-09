package vaibhav.assignment36;

/*Assignment : 36 [6th Dec'2020] 

Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)*/

public class UnionArray {
	
	public static double[] getUnionOfArray(double[] arr1, double[] arr2) {
		double [] union = new double[arr1.length + arr2.length];
		int k = 0;		
		for (int i = 0 ; i < arr1.length; i++) { //Adding numbers from array 1 to union and checking for duplicate
			boolean flag = true; 
			double num = arr1[i];
			for(int j = 0 ; j< union.length;j++) {
				if (num == union[j]) {
					flag = false;
					break;
				}
			}if(flag == true) {
				union[k]=arr1[i];
				k++;
			}			
		}
		for (int i = 0 ; i < arr2.length; i++) { //Adding numbers from array 2 to union array and checking for duplicate
			boolean flag = true; 
			double num = arr2[i];
			for(int j = 0 ; j< union.length;j++) {
				if (num == union[j]) {
					flag = false;
					break;
				}
			}if(flag == true) {
				union[k]=arr2[i];
				k++;
			}			
		}

		for(int j = 0 ; j< union.length;j++) {
			System.out.print(","+union[j]);
		}
		
		return union;	
	}

	

	public static void main(String[] args) {
		double [] arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
        double [] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
        double[] union=UnionArray.getUnionOfArray(arr1,arr2);

	}

}
