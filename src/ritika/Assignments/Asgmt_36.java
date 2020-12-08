package ritika.Assignments;

import java.util.Arrays;

/*Assignment : 36 [6th Dec'2020]

Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)

Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35
*/
public class Asgmt_36 {
	
	double[] getUnionOfArray(double[] arr1, double[] arr2) {
		String temp = "";
		double[] tempArr = new double [arr1.length + arr2.length];
		System.arraycopy(arr1, 0, tempArr, 0, arr1.length);
		System.arraycopy(arr2, 0, tempArr, arr1.length, arr2.length);
		
		for (int index=0; index<tempArr.length; index++) {
			if (tempArr[index] != 0) {
				for (int innerIndex=index+1; innerIndex<tempArr.length; innerIndex++) {
					if(tempArr[index] == tempArr[innerIndex] && index<innerIndex) {
						tempArr[innerIndex] = 0;
					}
				}
				temp= temp+tempArr[index]+" ";
			}
		}
		String [] splitArr = temp.split(" ");
		double[] outputUnion = new double[splitArr.length];
		
		for (int j=0; j<splitArr.length; j++) {
			outputUnion[j] = Double.parseDouble(splitArr[j]);
		}
		return outputUnion;
	}
	
	double[] getIntersectionOfArray(double[] arr1, double[] arr2) {
		String temp="";
		for (int i=0; i<arr1.length; i++) {
			if(arr1[i] !=0) {
				for (int j=0; j<arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
						temp=temp+arr1[i]+" ";
						arr2[j]=0;
					}
				}
			}
		}
		String [] splitArr = temp.split(" ");
		double[] outputIntersection = new double[splitArr.length];
		
		for (int j=0; j<splitArr.length; j++) {
			outputIntersection[j] = Double.parseDouble(splitArr[j]);
		}
		return outputIntersection;
	}
		
	public static void main(String[] args) {
		double arr1[] = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double arr2[] = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		Asgmt_36 program1 = new Asgmt_36();
		System.out.println("Union of given 2 arrays is: " + Arrays.toString(program1.getUnionOfArray(arr1, arr2)));
		System.out.println();
		Asgmt_36 program2 = new Asgmt_36();
		System.out.println("Intersection of given 2 arrays is: " + Arrays.toString(program2.getIntersectionOfArray(arr1, arr2)));
	}
}
