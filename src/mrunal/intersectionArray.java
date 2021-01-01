package mrunal;
/* Program 2: Find intersection(common elements) of two arrays.
Input: arr1 -> {10.45, 14.0, 18.35, 88.88, 54.10, 18.35}
          arr2 -> {17.20, 13.30, 10.45, 18.35, 84.33, 13.30}

Output: 10.45, 18.35*/
public class intersectionArray {

	static int counterForNewArray = 0;

	boolean checkTheValueAlreadyPresentInNewArray(double[] newArray, double intialValueFromArray1) {
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] == intialValueFromArray1) {
				return true;
			}
		}
		return false;
	}

	boolean checkIntialValuePresentInArray2(double[] newArray, double[] array2, double intialValueFromArray1) {
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == intialValueFromArray1) {
				newArray[counterForNewArray] = intialValueFromArray1;
				counterForNewArray++;
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		intersectionArray intersectionoftwoarray = new intersectionArray();
		double array1[] = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double array2[] = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		double newArray[] = new double[array1.length];
		for (int i = 0; i < array1.length; i++) {
			double intialValueFromArray1 = array1[i];
			if (!intersectionoftwoarray.checkTheValueAlreadyPresentInNewArray(newArray, intialValueFromArray1)) {
				intersectionoftwoarray.checkIntialValuePresentInArray2(newArray, array2, intialValueFromArray1);
			}
		}

		for (int i = 0; i < counterForNewArray; i++) {

			System.out.print(" " + newArray[i]);
		}
	}
}