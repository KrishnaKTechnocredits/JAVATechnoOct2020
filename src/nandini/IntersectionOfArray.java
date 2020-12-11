package nandini;

public class IntersectionOfArray {

	void getIntersectionOfArray(double[] arr, double[] arr1) {
		for(int i = 0 ; i < arr.length;i ++) {
			for (int j = 0; j<arr1.length;j++) {
				if (arr1[i]==arr1[j] ){
					System.out.print(arr1[i] + ",");
					arr1[j]=0;			
					break;
				}
			}		
		}	
		
	}
	public static void main(String args[]) {
		double []arr1 = {10.45, 14.0, 18.35, 88.88, 54.10, 18.35};
        double []arr2 = {17.20, 13.30, 10.45, 18.35, 84.33, 13.30};
        new IntersectionOfArray().getIntersectionOfArray(arr1, arr2);     
	}
}
