
/*
 * Print trees which will be visible
 */

public class TreesExam {
	
	public static void main(String[] args) {
		int[] arr1 = {3,5,5,7,9,13,11,12};
		int[] arr2 = {11,5,13,12,16,15};
		System.out.println("----Output1-----");
		displayVisibileTrees(arr1);
		System.out.println();
		System.out.println("----Output2-----");
		displayVisibileTrees(arr2);
	}
	
	static void displayVisibileTrees(int[] arr) {
		int tmp=0,cnt=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>tmp) {
				//System.out.print(" "+arr[index]);
				tmp=arr[index];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
