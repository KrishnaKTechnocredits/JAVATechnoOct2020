package ruby;

import java.util.Arrays;

/*Assignment : 35 [6th Dec'2020] 

Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)

Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35*/


public class Assignment36Union {
	
	double[] union;
	int cnt=0;
	
	double[] getUnionOfArray(double[] arr1, double[] arr2) {
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int unionLen = arr1.length + arr2.length;
		union = new double[unionLen];
		findUnion(arr1);
		findUnion(arr2);
		for(int i=0; i<union.length;i++) {
			union[i]= this.union[i];
		}
		return union;
	}
	
	public void findUnion(double[] arr) {
		for(int i=0; i<arr.length;i++) {
			boolean flag = true;
			for(int j=0; j<union.length && union[j] !=0.0;j++) {
				if (arr[i] == union[j]) {
					flag= false;
					break;
				}
			}if(flag) {
				union[cnt++] = arr[i];
			}
		}
	}

	public static void main(String[] args) {
		double[] arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		Assignment36Union assign = new Assignment36Union();
		double[] union = assign.getUnionOfArray(arr1, arr2);
		System.out.println("Union of two arrays: "+Arrays.toString(union));
		
	}

}
