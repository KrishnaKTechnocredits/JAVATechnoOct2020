/*Program 1: WAP to Find Common Element Between Two Arrays

input: 

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7
*/

package tejashree;

public class CompareTwoArrays {

	public void compareArrays(int []a1, int []a2) {
		for(int index=0;index<a1.length;index++) {
				if(a1[index]==a2[index]) {
					System.out.print(a1[index]+" ");
				}
			}
		}
	
	public static void main(String[] args) {
		int array1 [] = {1, 2, 5, 5, 8, 9,7,10};
		int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};
		System.out.println("Identical elements in two arrays are:");
		new CompareTwoArrays().compareArrays(array1, array2);
	}
}
