package monika;

/*

Program 1: WAP to Find Common Element Between Two Arrays

input:

int array1 [] = [1, 2, 5, 5, 8, 9, 7, 10]
int array2 [] = [1, 0, 6, 15, 6, 4, 7, 0]

output: 1 7

*/

public class CommonElement {

	void arraycommonelement(int[] array1, int[] array2) {
		//System.out.println("Common elements between 2 arrays : ");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == (array2[j])) {

					System.out.println((array1[i]));
				}
			} 
		} System.out.println("Common elements between 2 arrays : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		CommonElement commonelement = new CommonElement();
		commonelement.arraycommonelement(array1, array2);
	}
}