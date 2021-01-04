/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35*/

package kajol;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
	static int count=0;
	double[] findintersectionOfArrays(double[]array1,double[]array2) {
		System.out.println("Array 1 : "+Arrays.toString(array1));
		System.out.println("Array 2 : "+Arrays.toString(array2));
		double[]intersectionArray=new double[array1.length<array2.length ? array1.length :array2.length];
		for(int index=0;index<array1.length;index++) {
			for(int innerIndex=index+1;innerIndex<array2.length;innerIndex++) {
				if(array1[index]==array2[innerIndex]) {
					intersectionArray[count]=array1[index];
					count++;
				}
			}
		}
		return intersectionArray;	
	}
	
	public static void main(String[] args) {
		double[]array1={10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double[]array2={17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		double[]intersection=new IntersectionOfTwoArrays().findintersectionOfArrays(array1, array2);
		System.out.print("Intersection of Arrays is: ");
		for (int index=0;index<count;index++) {
			System.out.print(" "+intersection[index]+" ");
		}
	}
}
