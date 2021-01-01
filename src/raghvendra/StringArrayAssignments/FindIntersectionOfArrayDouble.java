package raghvendra.StringArrayAssignments;
/*Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35*/
import java.util.Arrays;
public class FindIntersectionOfArrayDouble {
	double[] findIntersectionOfDoubleArray(double[] arr1, double[] arr2) {
		double[] intersection=new double[arr1.length];
		int count=0;
		for(int index=0;index<arr1.length;index++) {
			if (findIntresection(arr2,intersection,arr1[index])) {
				intersection[count]=arr1[index];
				count++;
			}
		}
		return intersection;
	}
		boolean findIntresection(double[] arr,double[] intersection,double number){
			boolean flag=false;
			int count =0;
			for(int index1=0;index1<intersection.length;index1++) {
				if(number==intersection[index1])
					count++;
			}
			for(int index=0;index<arr.length;index++) {
				if(number==arr[index] && count<1) {
					flag=true;
					count=0;
				}
			}
				return flag;
		}
	
	public static void main(String[] args) {
		FindIntersectionOfArrayDouble findIntersectionOfArrayDouble=new FindIntersectionOfArrayDouble();
		double[] arr1={10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
        double[] arr2= {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
        double[] intersection=findIntersectionOfArrayDouble.findIntersectionOfDoubleArray(arr1,arr2);
        System.out.println("Array 1: "+Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));
        System.out.print("Intersection is: ");
        for(int index=0;index<intersection.length;index++) {
        	for(int innerIndex=index+1;innerIndex<index+2;innerIndex++) {
        		if(intersection[index]!=0 ) {
        			System.out.print(intersection[index]+" ");
        			break;
        		}
        	}
        }
	}
}
