/*Program 1:
Given are the hieght of tree. WAP to find total no of trees visible to man 
Hieght = [11,5,13,12,16,15]
output: 3

Hieght = [3,5,5,7,9,13,11,12]
output: 5
*/
package shrutiS.codingExam.exam5;

public class TreesVisible {

	void getTreeHieght(int[] treeHieght) {
		System.out.print("Height of trees: ");
		for (int index = 0; index < treeHieght.length; index++) {
			System.out.print(treeHieght[index] + " ");
		}
	}

	void findTotalNoOfVisibleTrees(int[] treeHieght) {
		int maxHeight = treeHieght[0];
		int count = 1;
		for (int index = 1; index < treeHieght.length; index++) {
			if (treeHieght[index] > maxHeight) {
				count++;
				maxHeight = treeHieght[index];
			}
		}
		System.out.println("\nTotal no of trees visible to man : " + count);
	}

	public static void main(String[] args) {
		TreesVisible visibleTress = new TreesVisible();
		int[] treeHieght1 = { 11, 5, 13, 12, 16, 15 };
		int[] treeHieght2 = { 3, 5, 5, 7, 9, 13, 11, 12 };
		visibleTress.getTreeHieght(treeHieght1);
		visibleTress.findTotalNoOfVisibleTrees(treeHieght1);
		System.out.println("\n********************************************************");
		visibleTress.getTreeHieght(treeHieght2);
		visibleTress.findTotalNoOfVisibleTrees(treeHieght2);
	}
}
