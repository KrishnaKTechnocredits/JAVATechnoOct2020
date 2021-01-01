package yogita;

public class Tree {
	void displayTree(int[] array) {
		int cnt = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				cnt++;
			}
		}
		System.out.println("Visibile Tree Count is: " + cnt);
	}

	public static void main(String[] args) {
		Tree t = new Tree();
		int[] input1 = { 3, 5, 5, 7, 9, 13, 11, 12 };
		int[] input2 = { 11, 5, 13, 12, 16, 15 };
		t.displayTree(input1);
		t.displayTree(input2);
	}
}
