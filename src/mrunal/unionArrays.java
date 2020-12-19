package mrunal;
/*Program 1: Find union of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 14.0, 18.35, 88.88, 54.10, 17.20, 13.30, 84.33
Method Signature : double[] getUnionOfArray(double[] arr1, double[] arr2)
*/
public class unionArrays {

	static int counterForNewArray = 0;
	void displayAllElementsFromArray(double arr1[],double arr2[]) {
		  double newarray2[] = new double[arr1.length+arr2.length];
//		  newarray2 = arr1;
		  for(int i=0;i<arr1.length;i++) {
			  if(!checkTheValueAlreadyPresentInNewArray(newarray2,arr1[i])){
				  newarray2[counterForNewArray]=arr1[i];
				  counterForNewArray++;
			  }
		  }
		  for(int i=0;i<arr2.length;i++) {
			  if(!checkTheValueAlreadyPresentInNewArray(newarray2,arr2[i])){
				  newarray2[counterForNewArray]=arr2[i];
				  counterForNewArray++;
		  }
		  }
		  for(int i=0;i<counterForNewArray;i++) {
			  System.out.print(" " + newarray2[i]);

		 }
	}
	boolean checkTheValueAlreadyPresentInNewArray(double[] newArray, double valueFromArray1) {
				for (int i = 0; i < newArray.length; i++) {
					if (newArray[i] == valueFromArray1) {
						return true;
					}
				}
				return false;
			}

	public static void main(String[] args) {
		unionArrays unionoftwoarray = new unionArrays();
		double array1[] = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double array2[] = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		unionoftwoarray.displayAllElementsFromArray(array1,array2);
	}
}