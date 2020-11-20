package technoCredits.array;

import java.util.Arrays;

public class RerverseArray2 {

	String[] getReserveArray(String[] arr) {
		String[] temp = new String[arr.length];
		int count = 0;
		for(int index=arr.length-1;index>=0;index--) {
			temp[count++] = arr[index];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		String[] names = {"Apurva", "Pooja", "Nagendra", "Suresh", "Suvela", "Ankita"};
		RerverseArray2 rerverseArray = new RerverseArray2();
		String[] output = rerverseArray.getReserveArray(names);
		System.out.println(Arrays.toString(output));
	}
}
