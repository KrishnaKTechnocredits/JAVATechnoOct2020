package anjaliP;

public class ReverseArray {
	void arrayReverse(String str[]) {
		for (int index1 = str.length - 1; index1 >= 0; index1--) {
			System.out.print(str[index1] + " ");
		}
	}

	public static void main(String args[]) {
		ReverseArray reversearray = new ReverseArray();
		String arr[] = { "Anjali", "Khushboo", "Vivaan", "Pooja" };
		reversearray.arrayReverse(arr);
	}
}
