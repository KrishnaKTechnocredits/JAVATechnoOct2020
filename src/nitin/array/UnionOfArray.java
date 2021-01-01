package nitin.array;
import java.util.Arrays;
/* Assignment : 36 [6th Dec'2020] Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
       arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)*/
public class UnionOfArray {
	static double[] temp;
	int count=0;
	public double[] getUnionOfArray(double arr1[],double[] arr2) {
		temp= new double[arr1.length+arr2.length];
		for(int index=0;index<arr1.length;index++) {
			if(!findUnion(temp, arr1[index])) {
				temp[count]=arr1[index];
					count++;
			}
			for(int inner=0;inner<arr2.length;inner++) {
				if(!findUnion(temp,arr2[index])) {
					temp[count]=arr2[index];
					count++;
					break;
				}
			}
		}
		return temp;	
	}
	boolean findUnion(double[]union,double input) {
		boolean flag=false;
		for(int index=0;index<union.length;index++) {
			if(input==union[index])
				flag=true;
		}
		return flag;
	}
	public static void main(String[] args) {
		double input[]= {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
		double input1[]= {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
		System.out.println("Input Array1 --> "+Arrays.toString(input));
		System.out.println("Input Array1 --> "+Arrays.toString(input1));
		System.out.print("Union is ");
		UnionOfArray unionOfArray = new UnionOfArray();
		unionOfArray.getUnionOfArray(input,input1);
		for(int index=0;index<temp.length;index++) {
			if(temp[index]!=0)
				System.out.print(temp[index]+", ");
		}
	}
}
