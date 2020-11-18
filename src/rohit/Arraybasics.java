package rohit;

public class Arraybasics {
	int minimumnumber(int[] arr1) {
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		return min;
	}

	int maximumnumber(int[] arr2) {

		int max = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			if (max < arr2[i]) {
				max = arr2[i];
			}
		}
		return max;
	}

	int averageofnumbers(int[] arr3) {
		int sum = 0;
		for (int i = 0; i < arr3.length; i++) {
			sum = sum + arr3[i];
		}
		int avg = sum / arr3.length;
		return avg;
	}

	void displayallnumbers0tolength(int[] arr4) {
		System.out.println("Array listing from 0 to length- ");
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
	}

	void displayallnumberslengthto0(int[] arr5) {
		System.out.println("Array listing form length to 0- ");
		for (int i = arr5.length - 1; i >= 0; i--) {
			System.out.println(arr5[i]);
		}
	}

	int averageofminmaxnumbers(int max, int min) {
		int averagreofminmax = (max + min) / 2;
		return averagreofminmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		Arraybasics arraybasics = new Arraybasics();
		System.out.println("Minimum number form array is- " + arraybasics.minimumnumber(arr));
		System.out.println("Maximum number form array is- " + arraybasics.maximumnumber(arr));
		System.out.println("Average form the provided array is- " + arraybasics.averageofnumbers(arr));
		arraybasics.displayallnumbers0tolength(arr);
		arraybasics.displayallnumberslengthto0(arr);
		System.out.println("Average of min and max number from the array is- "
				+ arraybasics.averageofminmaxnumbers(arraybasics.minimumnumber(arr), arraybasics.maximumnumber(arr)));
	}

}
