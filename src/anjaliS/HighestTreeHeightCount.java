package anjaliS;

public class HighestTreeHeightCount {
	int count = 0, maxNumber = 0;

	void visiblityOfTreeCount(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxNumber) {
				maxNumber = array[i];
				count++;
			}
		}
		System.out.println("Person can view " + count + " trees");
	}

	public static void main(String[] args) {
		HighestTreeHeightCount highesttreeheightcount = new HighestTreeHeightCount();
		int arr[] = { 11, 12, 13, 14, 16, 15 };
		highesttreeheightcount.visiblityOfTreeCount(arr);

	}

}
