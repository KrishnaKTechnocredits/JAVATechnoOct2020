package nagendra.array;

/*
Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}
Output: 10.45, 18.35
*/

public class IntersectionOfArray {
	
 void getIntersectionOfArray(double[] arr1,double[] arr2){
	 for(int i=0;i<arr1.length;i++){
		 for(int j=0;j<arr2.length;j++){
			 if(arr1[i]==arr2[j] && i<j){
				 System.out.println(arr1[i]);
				 break;
			 }
		 }
	 } 
 }
public static void main(String[] args) {
	IntersectionOfArray array=new IntersectionOfArray();
	double[] arr1={10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
    double[] arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
    array.getIntersectionOfArray(arr1, arr2);
}
}