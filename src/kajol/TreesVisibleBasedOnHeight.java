/*Program-1
 * Given input array of trees Heights
 * Find How many trees will be visible based on their heights.
 * Given:there is no obstacle between observer and first tree and trees aligned back to back vertically.
 * input array1[]={3,5,5,7,9,13,11,12}
 * input array2[]={11,5,13,12,16,15}
 * */

package kajol;

import java.util.Arrays;

public class TreesVisibleBasedOnHeight {
	
	int findTressVisible(int arrayOfTreesWithHeights[]) {
		int countOfTreesVisible=1;
		int maxHeightTree=arrayOfTreesWithHeights[0];
		for(int index=1;index<arrayOfTreesWithHeights.length;index++) {
			if(arrayOfTreesWithHeights[index]>maxHeightTree) {
				maxHeightTree=arrayOfTreesWithHeights[index];
				countOfTreesVisible++;
			}
		}
		return countOfTreesVisible;
	}
	
	public static void main(String args[]) {
		int arrayOfTreesWithHeights[]={3,5,5,7,9,13,11,12};
		System.out.println("Given heights of Trees are: "+Arrays.toString(arrayOfTreesWithHeights));
		System.out.println("Number of Trees Visible are: "+new TreesVisibleBasedOnHeight().findTressVisible(arrayOfTreesWithHeights));
		System.out.println("----------------------------------------------------------");
		int arrayOfTreesWithHeights1[]={11,5,13,12,16,15};	
		System.out.println("Given heights of Trees are: "+Arrays.toString(arrayOfTreesWithHeights1));
		System.out.println("Number of Trees Visible are: "+new TreesVisibleBasedOnHeight().findTressVisible(arrayOfTreesWithHeights1));
	}
	

}
