/*Assignment : 36 [6th Dec'2020] 

Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/

package kajol;

import java.util.Arrays;

public class UnionOfTwoArrays {
	double unionArray[];
	static int countOfUnion=0;
	double [] findUnionOfArrays(double array1[],double array2[]) {
		System.out.println("Array 1 : "+Arrays.toString(array1));
		System.out.println("Array 2 : "+Arrays.toString(array2));
		unionArray=new double[array1.length+array2.length];
		copyArray(array1);
		copyArray(array2);	
		return unionArray;		
	}
	
	void copyArray(double[] inputArray) {
		for(int index=0;index<inputArray.length;index++) {
			boolean flag=true;
			for(int innerIndex=0;innerIndex<unionArray.length;innerIndex++) {
				if(inputArray[index]==unionArray[innerIndex]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				unionArray[countOfUnion]=inputArray[index];
				countOfUnion++;
			}	
		}
	}
	
	public static void main(String[] args) {
		double array1[]={10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double array2[]= {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		double union[]=new UnionOfTwoArrays().findUnionOfArrays(array1, array2);
		System.out.print("Union of Arrays is: ");
		for (int index=0;index<countOfUnion;index++) {
			System.out.print(" "+union[index]+" ");
		}	
	}
}


