package raghvendra.StringArrayAssignments;
import java.util.Arrays;
/*Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)*/
public class FindDoubleUnion {
	double[] getUnionOfArray(double[] arr1, double[] arr2) {
		double[] union=new double[arr1.length+arr2.length];
		int count=0;
		for(int index=0;index<arr1.length;index++) {
			if (!findUnion(union,arr1[index])) {
				union[count]=arr1[index];
				count++;
			}
			for(int innerIndex=0;innerIndex<arr2.length;innerIndex++) {
				if (!findUnion(union,arr2[innerIndex])) {
					union[count]=arr2[innerIndex];
					count++;
					break;
				}
			}
		}
		return union;
	}
		boolean findUnion(double[] union,double input){
			boolean flag=false;
			for(int index=0;index<union.length;index++) {
				if(input==union[index])
					flag=true;
			}
				return flag;
		}
	
	public static void main(String[] args) {
		FindDoubleUnion findDoubleUnion=new FindDoubleUnion();
		double[] arr1={10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
        double[] arr2= {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
        double[] union=findDoubleUnion.getUnionOfArray(arr1,arr2);
        System.out.println("Array 1: "+Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));
        System.out.print("Union is : ");
        for(int index=0;index<union.length;index++) {
        	if(union[index]!=0)
        	System.out.print(union[index]+" ");
        }
	}
}
