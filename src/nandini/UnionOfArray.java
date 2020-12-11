package nandini;

import vaibhav.assignment36.UnionArray;

public class UnionOfArray {
    
	double[] getUnionofArray(double[] arr, double[] arr1) {
		double [] unionArray = new double[arr1.length + arr1.length];
		int k = 0;		
		for (int i = 0 ; i < arr.length; i++) { 
			boolean flag = true; 
			double num = arr[i];
			for(int j = 0 ; j< unionArray.length;j++) {
				if (num == unionArray[j]) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				unionArray[k]=arr[i];
				k++;
			}			
		}
		for (int i = 0 ; i < arr1.length; i++) { 
			boolean flag = true; 
			double num = arr1[i];
			for(int j = 0 ; j< unionArray.length;j++) {
				if (num == unionArray[j]) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				unionArray[k]=arr1[i];
				k++;
			}			
		}

		for(int j = 0 ; j< unionArray.length;j++) {
			System.out.print(unionArray[j] + ",");
		}
		
		return unionArray;
	}
	
	public static void main(String args[]) {
		double [] arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
        double [] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
        double[] union=UnionArray.getUnionOfArray(arr1,arr2);
		
	}
}
