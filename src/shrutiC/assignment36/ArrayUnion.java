package shrutiC.assignment36;

import java.util.Arrays;

public class ArrayUnion {

	double[] arrayUnion;
	int count = 0;

	public void getArrayUnion(double[] arr1, double[] arr2) {

		arrayUnion = new double[arr1.length + arr2.length];

		getUnion(arr1);
		getUnion(arr2);
		
		System.out.println("Union : " + Arrays.toString(this.arrayUnion));
	}

	void getUnion(double[] array) {
		for(int i=0; i<array.length;i++) {
			boolean flag = true;
			for(int j=0; j<arrayUnion.length && arrayUnion[j] !=0.0;j++) {
				if (array[i] == arrayUnion[j]) {
					flag= false;
					break;
				}
			}if(flag) {
				arrayUnion[count++] = array[i];
			}
		}}

	public static void main(String[] args) {

		double[] arr1 = { 10.45, 14.0, 18.35, 88.88, 54.10, 18.35 };
		double[] arr2 = { 17.20, 13.30, 10.45, 18.35, 84.33, 13.30 };
		
		System.out.println("Array1 : " + Arrays.toString(arr1));
		System.out.println("Array2 : " + Arrays.toString(arr2));
		
		ArrayUnion obj = new ArrayUnion();
		obj.getArrayUnion(arr1, arr2);

	}

}
