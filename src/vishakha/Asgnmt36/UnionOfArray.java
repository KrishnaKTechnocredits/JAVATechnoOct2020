/*Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)*/

package vishakha.Asgnmt36;

import java.util.Arrays;

public class UnionOfArray {
	
	int count;
	double[] unionArr;

	double[] getUnionOfArray(double[] arr1, double[] arr2){
		unionArr = new double[arr1.length + arr2.length];
		executeUnion(arr1, unionArr);
		executeUnion(arr2, unionArr);		
		double[] unionArr = new double[count];
		for (int i = 0; i < unionArr.length; i++)
			unionArr[i] = this.unionArr[i];
		return unionArr;
	}

	private void executeUnion(double[] inputArr, double[] unionArr) {
		for(int i=0; i<inputArr.length; i++){
			boolean flag = true;
			for(int j=0; j<unionArr.length; j++){
				if(inputArr[i] == unionArr[j]){
					flag = false;
					break;
				}
			}if(flag){
				unionArr[count++] = inputArr[i];
			}
		}
	}

	public static void main(String[] args) {
		double arr1[] = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double arr2[] = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		double[] unionArr = new UnionOfArray().getUnionOfArray(arr1, arr2);
		System.out.println("Union of array is "+Arrays.toString(unionArr));
	}
}
