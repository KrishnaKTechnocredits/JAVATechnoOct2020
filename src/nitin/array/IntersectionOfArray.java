package nitin.array;
import java.util.Arrays;
/* Assignment : 36  - Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
       arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
Output: 10.45, 18.35*/
public class IntersectionOfArray {
	public double[] findIntersectionOfArray(double[] arr1,double[] arr2) {
		double temp[]= new double[(arr1.length<=arr2.length) ? arr1.length : arr2.length]; //using ternary operator here.
		int count=0;
		for(int index=0;index<arr1.length;index++) {
			if(!isNumberPresent(temp,arr1[index])) {
				for(int inner=0;inner<arr2.length;inner++) {
					if(arr1[index]==arr2[inner]) {
						temp[count++]=arr1[index];
						break;
					}	
				}
			}
		}
		double intersection[]=new double[count];
		for(int index=0;index<intersection.length;index++)
			intersection[index]=temp[index];
		return intersection;
	}
	public boolean isNumberPresent(double[] arr3, double input) {
		for(int index=0;index<arr3.length;index++) {
			if(arr3[index]==input)
				return true;
			else if(arr3[index]==0.0)
				return false;
		}
		return false;
	}
	public static void main(String[] args) {
		IntersectionOfArray intersectionOfArray = new IntersectionOfArray();
		double input[] = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double input1[] = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		System.out.println("Input Array1 --> "+Arrays.toString(input));
		System.out.println("Input Array2 --> "+Arrays.toString(input1));
		double intersection[]=intersectionOfArray.findIntersectionOfArray(input,input1);
		System.out.println("Intersection of both Arrays is "+Arrays.toString(intersection));
	}
}
