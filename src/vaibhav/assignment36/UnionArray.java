package vaibhav.assignment36;

import java.util.Arrays;

/*Assignment : 36 [6th Dec'2020] 

Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)*/

public class UnionArray {
	
	public static double[] getUnionOfArray(double[] arr1, double[] arr2) {
		double []array3= {10.45, 14.0, 18.35, 88.88, 54.10, 18.35,17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		double [] union = new double[array3.length];
		int count = 0;
		for (int i = 0 ; i < array3.length;i++) {
			double temp= array3[i] ;
			boolean flag=checkDuplicate(temp,union);
			if(!flag) {
				union[count++]=temp;
			}			
		}		
		return union;		
	}	

	private static boolean checkDuplicate(double temp, double[] union) {
		boolean flag = false;
		for (int j = 0 ;j< union.length;j++) {
			if (temp == union[j]) {
				flag = true;
			}
		}
		return flag;		
	}

	public static void main(String[] args) {
		double [] arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
        double [] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
        double[] union=UnionArray.getUnionOfArray(arr1,arr2);
        for (int i = 0; i< union.length;i++) {
        	System.out.print(","+union[i]);
        }

	}

}
