package prasad.Stringandarray;
import java.util.Arrays;

//Take taken: 30 mins 
public class TreesVisible {
	
	int findNoTreesVisible(int[]trees) {
		int count=0;
		for(int i=0;i<trees.length;i++) {
			int innercount=0;
			int selectedTree = trees[i];
			if(i==0) {
				count++;
			}
			else if(i!=0) {
				for(int j=i;j>=0;j--) {
					if(j!=i) {
					if(trees[j]>selectedTree || trees[j]==selectedTree)
						break;
					else if(trees[j]<selectedTree) {
						innercount++;
					}
				}
			}
		}
			if(innercount==i&&i!=0)
				count++;
		}
		
		return count ;
	}
	
	public static void main(String[]arg) {
		TreesVisible treesvisible = new TreesVisible();
		int [] trees = {11,5,13,12,16,15};
		System.out.print("Person viewing trees planted in a row with given heights---> ");
		System.out.println(Arrays.toString(trees));
		int noOfTreesVisible= treesvisible.findNoTreesVisible(trees);
		System.out.println("No of trees visible to person: " + noOfTreesVisible);
	}

}
